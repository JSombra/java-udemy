package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class VectEx11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas: ");
        int n = sc.nextInt();
        int countMen = 0;
        int countWomen = 0;
        double avgWomenHeight = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        double[] height = new double[n];
        char[] genre = new char[n];

        for(int i = 0; i < height.length; i++){
            System.out.printf("Altura da %da pessoa: ", i + 1);
            height[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa: ", i + 1);
            genre[i] = sc.next().charAt(0);

            if(genre[i] == 'F'){
                avgWomenHeight += height[i];
                countWomen++;
            } else {
                countMen++;
            }

            if(height[i] > max){
                max = height[i];
            }

            if(height[i] < min){
                min = height[i];
            }
        }
        System.out.printf("Menor Altura: %.2f ", min);
        System.out.printf("%nMaior Altura: %.2f", max);
        System.out.printf("%nMédia altura das mulheres: %.2f%n", avgWomenHeight / countWomen);
        System.out.printf("Número de homens: %d%n", countMen);
        

        sc.close();
    }
}
