package modulo14.application;

import modulo14.entities.Employee;
import modulo14.entities.OutsourceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEmployee {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> listEmployees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.printf("Employee #%d data%n", i);
            System.out.print("Outsourced (y/n): ");
            char res = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (res == 'y'){
                System.out.print("Aditional charger: ");
                double additionalCharger = sc.nextDouble();
                listEmployees.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharger));
            } else {
                listEmployees.add(new Employee(name, hours, valuePerHour));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS: ");
        for (Employee emp: listEmployees){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}
