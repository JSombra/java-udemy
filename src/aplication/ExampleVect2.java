package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ExampleVect2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();//atencão nisso. Sempre receber em variáveis
            double price = sc.nextDouble();//atencão nisso. Sempre receber em variáveis
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;
        for (Product product : vect) {
            sum += product.getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("AVERAGE PRICE: %.2f", avg);

        sc.close();
    }
}
