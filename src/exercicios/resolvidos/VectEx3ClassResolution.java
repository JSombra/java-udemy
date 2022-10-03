package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class VectEx3ClassResolution {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        
        Pessoas[] pessoa = new Pessoas[n];

        for(int i = 0; i < n; i++){
            System.out.printf("Dados da %da pessoa%n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Idade: ");
            int age = sc.nextInt();
            System.out.print("Altura: ");
            double height = sc.nextDouble();
            pessoa[i] = new Pessoas(name, age, height);
        }

        int menores = 0;        
        double sum = 0;
        for(int i = 0; i < n; i++){
            if(pessoa[i].getAge() < 16){
                menores++;
            }
            sum += pessoa[i].getHeight();
        }
        double avg = sum / n;
        double percentualMenores = ((double) menores / n) * 100.0;
        
        System.out.printf("%nAltura média: %.2f%n", avg);

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);

        for(int i = 0; i < n; i++){
            if(pessoa[i].getAge() < 16){
                System.out.println(pessoa[i].getName());
            }
        }

        sc.close();
    }
}
