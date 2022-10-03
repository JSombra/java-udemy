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
        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
            sumVect += vect[i];
        }
        double vectMedia = sumVect / vect.length;

        System.out.printf("%nMédia do Vetor: %.3f%n", vectMedia);

        System.out.println("Elementos abaixo da média: ");
        for(int i = 0; i < vect.length; i++){
            if(vect[i] < vectMedia){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
