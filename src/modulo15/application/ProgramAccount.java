package modulo15.application;

import modulo15.model.entities.Account;
import modulo15.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withdrawLimit);

        System.out.println();

        try {
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.whithdraw(amount);
            System.out.println("Nem balance: " + acc.getBalance());
        } catch (WithdrawException err){
            System.out.println(err.getMessage());
        }
        sc.close();
    }
}
