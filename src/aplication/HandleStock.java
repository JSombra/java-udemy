package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class HandleStock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: %s%n", product);

        System.out.print("Enter the number of products to be added in stock: ");
        product.AddProducts(sc.nextInt());
        System.out.printf("Updated data: %s%n", product);

        System.out.print("Enter the number of products to be removed in stock: ");
        product.RemoveProducts(sc.nextInt());
        System.out.printf("Updated data: %s%n", product);

        sc.close();
    }
}
