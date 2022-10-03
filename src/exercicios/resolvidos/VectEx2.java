package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class VectEx2{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números serão digitados: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um número: ");
            vect[i] = sc.nextDouble();
        }
        double sum = 0, avg = 0;
        System.out.println();
        System.out.print("VALORES: ");
        for (int i = 0; i < vect.length; i++){
            System.out.printf("%.1f  ", vect[i]);
            sum += vect[i];
        }
        avg = sum / vect.length;
        System.out.printf("%nSOMA: %.2f%n", sum);
        System.out.printf("MEDIA: %.2f%n", avg);

        sc.close();
    }
}