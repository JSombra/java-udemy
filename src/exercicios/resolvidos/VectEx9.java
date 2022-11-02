package exercicios.resolvidos;

import java.util.Scanner;

import primeirasaulas.entities.Pessoas;

public class VectEx9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas você vai digitar: ");
        int n = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[n];

        for(int i = 0; i < pessoa.length; i++){
            System.out.printf("Dados da %da pessoa%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            pessoa[i] = new Pessoas(name, age);
        }
        int maior = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < pessoa.length; i++){
            if(pessoa[i].getAge() > maior){
                maior = pessoa[i].getAge();
                count = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: " + pessoa[count].getName());

        sc.close();
    }
}
