package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int number;
        double valueHour, hour, salary;

        number = sc.nextInt();
        hour = sc.nextInt();
        valueHour = sc.nextDouble();

        salary = hour * valueHour;
        System.out.println("NUMBER = " + number);
        System.out.println("SALARY = U$" + salary);

        sc.close();
    }
}
