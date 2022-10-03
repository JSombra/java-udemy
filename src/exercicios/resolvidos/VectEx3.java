package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class VectEx3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        
        String[] name = new String[n];
        int[] age = new int[n];
        double[] height = new double[n];

        for(int i = 0; i < name.length; i++){
            System.out.printf("Dados da %da pessoa%n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            name[i] = sc.nextLine();
            System.out.print("Idade: ");
            age[i] = sc.nextInt();
            System.out.print("Altura: ");
            height[i] = sc.nextDouble();
        }

        int menores = 0;        
        double sum = 0;
        for(int i = 0; i < n; i++){
            if(age[i] < 16){
                menores++;
            }
            sum += height[i];
        }
        double avg = sum / n;
        double percentualMenores = ((double) menores / n) * 100.0;
        
        System.out.printf("Altura média: %.2f%n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%\n", percentualMenores);

        for(int i = 0; i < n; i++){
            if(age[i] < 16){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}
