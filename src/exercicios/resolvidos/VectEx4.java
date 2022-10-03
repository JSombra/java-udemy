package exercicios.resolvidos;

import java.util.Scanner;

public class VectEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números serão digitados: ");
        int n = sc.nextInt();

        int[] vectNum = new int[n];

        for(int i = 0; i < vectNum.length; i++){
            System.out.print("Digite um número: ");
            vectNum[i] = sc.nextInt();
        }
        int paresQtd = 0;
        System.out.println("\nNÚMEROS PARES: ");
        for(int i = 0; i < vectNum.length; i++){
            if(vectNum[i] % 2 == 0){
                System.out.printf("%d  ",vectNum[i]);
                paresQtd++;
            }
        }
        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", paresQtd); // \n no final e não irá aparecer o % ao final do terminal

        sc.close();
    }
}
