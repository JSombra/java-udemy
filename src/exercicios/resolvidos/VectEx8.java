package exercicios.resolvidos;

import java.util.Scanner;

public class VectEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos terá o vetor: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        int sumPares = 0, qtdPares = 0;
        double mediaPares = 0;
        for(int i = 0; i < array.length; i++){
            System.out.print("Digite um número: ");
            array[i] = sc.nextInt();

            if(array[i] % 2 == 0){ // For já cria o array, e ao mesmo tempo já verifica se o número é par, como solicitado no resto do exercicio;
                sumPares += array[i];
                qtdPares++;
            }
        }

        if(qtdPares == 0){
            System.out.println("NENHUM NÚMERO PAR");
        } else {
            mediaPares = (double) sumPares / qtdPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", mediaPares);
        }

        sc.close();
    }
}

