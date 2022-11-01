package modulo14.application;

import modulo14.entities.Account;
import modulo14.entities.BusinessAccount;
import modulo14.entities.SavingsAccount;
import modulo14.entities.enums.TypeAccount;



public class ProgramAccount {
    public static void main(String[] args) {
        BusinessAccount bacc = new BusinessAccount(1002, "Raquel", 0.0, 500.0);

        //UPCASTING
        //Atribuir um objeto de uma subclasse a um objeto da superclasse é aceito, pois a relação é do tipo É UM. Então a subclasse também é uma superclasse, por isso não ocorre o erro ao atribuir
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Luna", 0.0 , 200.0);
        Account acc3 = new SavingsAccount(1004, "Luninha", 1000.0, 0.09);

        //DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);


        //BusinessAccount acc5 = (BusinessAccaount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.withdraw(100.0);
            System.out.println(acc5.getBalance());
        }
    }
}
