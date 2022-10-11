package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class ListEx1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("How many employess will be registred: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.printf("Employee #%d : %n", i);
            System.out.print("ID: ");
            int id = sc.nextInt();

            while(hasId(list, id)){
                System.out.println("Id Already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            list.add(new Employee(id, name, salary));
            
            System.out.println();
        }

        System.out.println();
        System.out.print("Enter the employee id that will gave salary increase: ");
        int id = sc.nextInt();

        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null){
            System.out.println("This id dows not exist!");
        } else {
            System.out.print("Enter percentage: ");
            double increase = sc.nextDouble();
            emp.increaseSalary(increase);
        }

        System.out.println();
        System.out.println("List of Employee: ");
        for(Employee employee: list){
            System.out.println(employee);
        }

        sc.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
