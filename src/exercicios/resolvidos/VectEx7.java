package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;
public class VectEx7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos irão ter no vetor: ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double sumVect = 0;
        for(double value: vect){
            System.out.print("Digite um numero: ");
            value = sc.nextDouble();
            sumVect += value;
        }
        double vectMedia = sumVect / vect.length;

        System.out.printf("%nMédia do Vetor: %.3f%n", vectMedia);

        System.out.println("Elementos abaixo da média: ");
        for (double value : vect) {
            if(value < vectMedia){
                System.out.println(value);
            }
        }

        sc.close();
    }
}
