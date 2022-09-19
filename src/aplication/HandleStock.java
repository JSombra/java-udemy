package aplication;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class HandleStock {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        p1.name = sc.nextLine();

        System.out.print("Price: ");
        p1.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        p1.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $ %.2f, %d units, Total %.2f%n%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());

        System.out.print("Enter the number of products to be added in stock: ");
        p1.AddProducts(sc.nextInt());
        System.out.printf("Product data: %s, $ %.2f, %d units, Total %.2f%n%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());

        System.out.print("Enter the number of products to be removed in stock: ");
        p1.RemoveProducts(sc.nextInt());
        System.out.printf("Product data: %s, $ %.2f, %d units, Total %.2f%n%n", p1.name, p1.price, p1.quantity, p1.TotalValueInStock());

        sc.close();
    }
}
