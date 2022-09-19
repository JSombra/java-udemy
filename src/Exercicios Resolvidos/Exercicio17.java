import java.util.Locale;
import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char choice;
        do{
            System.out.print("Digite a Temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = (C * 9) / 5 + 32;
             
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir? (s/n)");
            choice = sc.next().charAt(0);
        } while(choice != 'n');


        sc.close();
    }
}
