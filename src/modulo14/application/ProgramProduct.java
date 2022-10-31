package modulo14.application;

import modulo14.entities.Product;
import modulo14.entities.ImportedProduct;
import modulo14.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ProgramProduct {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            System.out.printf("Product #%d data: %n", i);
            System.out.print("Common, used or imported: ");
            sc.nextLine();
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            if (type == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            } else if (type == 'c'){
                list.add(new Product(name, price));
            } else if (type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY) : ");
                sc.nextLine();
                Date date = sdf.parse(sc.nextLine());
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product: list){
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
