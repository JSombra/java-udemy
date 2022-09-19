package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtde;
        double price;
        cod = sc.nextInt();
        qtde = sc.nextInt();

        switch (cod) {
            case 1 -> {
                price = qtde * 4.0;
                System.out.printf("Total: %.2f", price);
            }
            case 2 -> {
                price = qtde * 4.50;
                System.out.printf("Total: %.2f", price);
            }
            case 3 -> {
                price = qtde * 5.0;
                System.out.printf("Total: %.2f", price);
            }
            case 4 -> {
                price = qtde * 2.0;
                System.out.printf("Total: %.2f", price);
            }
            case 5 -> {
                price = qtde * 1.50;
                System.out.printf("Total: %.2f", price);
            }
        }
        sc.close();
    }
}

