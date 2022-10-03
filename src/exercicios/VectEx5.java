package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class VectEx5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores serão digitados: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        double maior = 0, maiorPosicao = 0;
        for(int i = 0; i < vect.length; i++){
            if(vect[i] > maior){
                maior = vect[i];
                maiorPosicao = i;
            }
        }

        System.out.printf("\nMAIOR VALOR: %.2f%n", maior);
        System.out.println("POSIÇÃO DE MAIOR VALOR: " + maiorPosicao);


        sc.close();
    }
}
