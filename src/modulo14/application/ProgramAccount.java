package modulo14.application;

import modulo14.entities.Account;
import modulo14.entities.BusinessAccount;
import modulo14.entities.SavingsAccount;


public class ProgramAccount {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Jefferson", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Raquel", 0.0, 500.0);

        //UPCASTING
        //Atribuir um objeto de uma subclasse a um objeto da superclasse é aceito, pois a relação é do tipo É UM. Então a subclasse também é uma superclasse, por isso não ocorre o erro ao atribuir
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Luna", 0.0 , 200.0);
        Account acc3 = new SavingsAccount(1004, "Luninha", 0.0, 0.09);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        BusinessAccount acc5 = (BusinessAccount) acc3;

    }
}
