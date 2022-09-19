package exercicios.resolvidos;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, A, B, inicio, fim, duracaoTotal;
        System.out.print("Digite um número: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("POSITIVO");
        }

        if (n % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        System.out.println("");
        System.out.println("---------Exercicio 6--------");
        System.out.println("");
        System.out.print("Verificar multiplos: ");
        A = sc.nextInt();
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São Multiplos.");
        } else {
            System.out.println("Não são multiplos.");
        }

        System.out.println("");
        System.out.println("---------Exercicio 7--------");
        System.out.println("");

        System.out.print("Horas do jogo Inicio e Fim: ");
        inicio = sc.nextInt();
        fim = sc.nextInt();

        if (inicio < fim) {
            duracaoTotal = inicio + fim;
        } else {
            duracaoTotal = 24 - inicio + fim;
        }
        System.out.println("O jogo durou " + duracaoTotal);

        System.out.println("");
        System.out.println("---------Exercicio 8--------");
        System.out.println("");

        int cod, qtde;
        double price;
        cod = sc.nextInt();
        qtde = sc.nextInt();

        switch (cod) {
            case 1 -> {
                price = qtde * 4.0;
                System.out.println("Total: " + price);
            }
            case 2 -> {
                price = qtde * 4.50;
                System.out.println("Total: " + price);
            }
            case 3 -> {
                price = qtde * 5.0;
                System.out.println("Total: " + price);
            }
            case 4 -> {
                price = qtde * 2.0;
                System.out.println("Total: " + price);
            }
            case 5 -> {
                price = qtde * 1.50;
                System.out.println("Total: " + price);
            }
        }

        sc.close();
    }
}



