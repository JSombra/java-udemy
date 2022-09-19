package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 0; i < x; i++){
            int n1 = sc.nextInt();
            int denominador = sc.nextInt();
            if(denominador == 0){
                System.out.println("Divisão Impossível");
            } else {
                double divisao = (double) n1 / denominador;
                System.out.printf("%.1f%n", divisao);
            }
        }
        sc.close();
    }
}
