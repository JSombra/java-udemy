package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class HandleStock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);

        System.out.println();
        System.out.printf("Product data: %s%n", product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());

        System.out.println();
        System.out.printf("Updated data: %s%n", product);
        System.out.print("Enter the number of products to be removed in stock: ");
        product.RemoveProducts(sc.nextInt());
        System.out.println();
        System.out.printf("Updated data: %s%n", product);

        sc.close();
    }
}
