package aplication;

import java.util.Locale;
import java.util.Scanner;

public class ExampleVect1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantity Height: ");
        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }
        double average = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", average);

        sc.close();
    }
}
