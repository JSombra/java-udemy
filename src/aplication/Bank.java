package aplication;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;//linha corrigida conforme aula
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();//linha corrigida conforme aula. Necessário para consumir a quebra de linha derivada do nextInt
        String accountHolder = sc.nextLine();

        System.out.print("Is there initial deposit: (y/n): ");
        char response = sc.next().charAt(0); //Linha corrigida conforme exemplo da aula

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);//linha corrigida conforme aula
        } else {
            account = new Account(accountNumber, accountHolder);//linha corrigida conforme aula
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        account.deposit(sc.nextDouble());
        System.out.println("Updated data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Updated data: ");
        System.out.println(account);
        System.out.println();
        sc.close();
    }
}
