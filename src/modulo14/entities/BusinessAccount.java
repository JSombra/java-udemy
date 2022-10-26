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
}
