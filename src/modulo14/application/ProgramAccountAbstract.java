package modulo14.application;

import modulo14.entities.Account;
import modulo14.entities.BusinessAccount;
import modulo14.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramAccountAbstract {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Jefferson", 1000.0, 0.01));
        list.add(new BusinessAccount(1002, "Raquel", 500.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 1000.0, 0.01));
        list.add(new BusinessAccount(1004, "Alex", 700.0, 700.0));
        list.add(new BusinessAccount(1005, "Maria", 600.0, 400.0));

        double sum = 0;

        for (Account acc: list){
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", sum);

        for (Account acc: list){
            acc.deposit(10.0);
        }
        for (Account acc: list){
            System.out.printf("Update balance for account %d: %.2f%n",acc.getNumber(), acc.getBalance());
        }
        sum = 0;

        for (Account acc: list){
            sum += acc.getBalance();
        }
        System.out.printf("Total Balance: %.2f%n", sum);
    }
}
