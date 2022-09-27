package entities;

public class Account {
    private int numberAccount;
    private String accountHolder;
    private double balance;

    public Account(){}
    public Account(int numberAccount, String accountHolder, double balance) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        deposit(balance);
    }
    public Account(int numberAccount, String accountHolder) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + 5.00;
    }
    public String toString(){
        return "Account "
                + numberAccount
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}
