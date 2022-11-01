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
            totalTax = getAnualIncome() * 0.15;
        } else if (getAnualIncome() > 20000.0){
            totalTax = getAnualIncome() * 0.25;
        }
        if (getHealthExpenses() > 0){
            totalTax -= getHealthExpenses() * 0.5;
        }
        return totalTax;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(": $");
        sb.append(String.format("%.2f", calcTax()));
        return sb.toString();
    }
}
