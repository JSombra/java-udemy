package exercicios.resolvidos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for(int i = 0; i < x; i++){
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();
            double mp = (2 * n1 + 3 * n2 + 5 * n3) / 10;
            
            System.out.printf("%.1f%n", mp);
        }

        sc.close();
    }
}
