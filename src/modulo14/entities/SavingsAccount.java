package modulo14.entities;

public final class SavingsAccount extends Account{
    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    //Palavra chave final. Serve para indicar que um método ou classe não pode ser herdado ou sobreposto.
    @Override
    public final void withdraw(Double amount) {
        balance -= amount;
    }
}
