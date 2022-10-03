package exercicios.resolvidos;

import java.util.Scanner;

public class VectEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores terão cada vetor: ");
        int n = sc.nextInt();

        int[] vect1 = new int[n];                
        int[] vect2 = new int[n];        
        int[] sumVect = new int[n];        

        System.out.println("Digite os valores do Vetor A: ");
        for(int i = 0; i < vect1.length; i++){
            vect1[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do Vetor B");
        for(int i = 0; i < vect2.length; i++){
            vect2[i] = sc.nextInt();
        }
        
        System.out.println("Vetor resultante: ");
        for(int i = 0; i < vect2.length; i++){
            sumVect[i] = vect1[i] + vect2[i];
            System.out.println(sumVect[i]);
        }


        sc.close();
    }
}
