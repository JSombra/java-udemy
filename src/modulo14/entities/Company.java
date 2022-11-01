package modulo14.entities;

public class Company extends Taxpayer{
    private Integer totalEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer totalEmployees) {
        super(name, anualIncome);
        this.totalEmployees = totalEmployees;
    }

    public Integer getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(Integer totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    @Override
    public double calcTax() {
        double totalTax = 0;
        if (getTotalEmployees() > 10){
            totalTax = getAnualIncome() * 0.14;
        } else {
            totalTax = getAnualIncome() * 0.16;
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
