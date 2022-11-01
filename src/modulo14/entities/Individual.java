package modulo14.entities;

public class Individual extends Taxpayer{
    private Double healthExpenses;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenses) {
        super(name, anualIncome);
        this.healthExpenses = healthExpenses;
    }

    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double calcTax() {
        double totalTax = 0;
        if (getAnualIncome() < 20000.0){
            return getAnualIncome() * 0.15 - healthExpenses * 0.5;
        } else {
            return getAnualIncome() * 0.25 - healthExpenses * 0.5;
        }
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(": $");
        sb.append(String.format("%.2f", calcTax()));
        return sb.toString();
    }
}
