package aplication;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Purchase {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the dollar price?: ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought?: ");
        double totalValue = sc.nextDouble();
        double result = CurrencyConverter.converter(dollarPrice, totalValue);
        System.out.printf("Amount to be paid in reais = U$ %.2f%n", result); //pode ser colocado direto a chamada da classe CurrencyConverter.
        sc.close();
    }
}
