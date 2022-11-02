package modulo14.application;

import modulo14.entities.Company;
import modulo14.entities.Individual;
import modulo14.entities.Taxpayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTaxpayer {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Taxpayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.printf("Tax payer #%d%n", i);
            System.out.print("Individual or company (i/c): ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenses));
            } else {
                System.out.print("Number of Employees: ");
                int numberEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        for (Taxpayer taxpayer: list){
            System.out.println(taxpayer.toString());
        }

        //Um for para cada coisa, um para somar apenas, e outro para apenas imprimir os resultados. Cógido mais legível
        double sum = 0;
        for (Taxpayer taxpayer: list){
            sum += taxpayer.calcTax();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: %.2f%n", sum);

        sc.close();
    }
}
