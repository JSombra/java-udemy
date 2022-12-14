package modulo14.entities;

public abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
        if (balance - amount >= 0){
            balance -= amount + 5;
        } else {
            System.out.println("No balance avaliable");
        }
    }

    public void deposit(Double amount){
        balance += amount;
    }
}
