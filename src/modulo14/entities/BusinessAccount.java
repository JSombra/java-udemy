package modulo14.entities;

public class BusinessAccount extends Account{
    private Double loalLimit;

    public BusinessAccount() {
        super( );
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loalLimit) {
        super(number, holder, balance);
        this.loalLimit = loalLimit;
    }

    public Double getLoalLimit() {
        return loalLimit;
    }

    public void setLoalLimit(Double loalLimit) {
        this.loalLimit = loalLimit;
    }

    public void loan(Double amount){
        if (amount <= loalLimit){
            balance += amount - 10.0;
        }
    }
    //Anotação @Override indica ao compilador que esse método é um método reescrito da superclasse que herda.
    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2.0;
    }
}
