package modulo13.application;

import modulo13.entities.Client;
import modulo13.entities.Order;
import modulo13.entities.OrderItem;
import modulo13.entities.Product;
import modulo13.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("E-mail: ");
        String email = sc.nextLine();
        System.out.print("Birth date: ");
        Date date = sdf.parse(sc.nextLine());
        //Linha 21 até 29 apenas para instanciar o client.
        Client client = new Client(name, email, date);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order: ");
        int n = sc.nextInt();
        Order order = new Order(new Date(), OrderStatus.valueOf(status), client); //Sem problemas passar direto o value of para instanciar

        for (int i = 1; i <= n; i++){
            System.out.printf("Enter #%d item data: %n", i);

            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            order.addItems(orderItem);
        }
        System.out.println();
        System.out.println(order);

        sc.close();
    }
}
