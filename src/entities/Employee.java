package entities;

public class Employee {
    public int id;
    public String name;
    public double grossSalary, tax;

    public Employee() {
    }

    public Employee(int id, String name, double grossSalary) {
        this.id = id;
        this.name = name;
        this.grossSalary = grossSalary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGrossSalary() {
        return grossSalary;
    }

    public double netSalary(){
        return grossSalary - tax;
    }
    public void increaseSalary(double increase){
        grossSalary += grossSalary * increase / 100;
    }
    public String toString(){
        return id + ", " + name + ", $ " + String.format("%.2f", netSalary());
    }
}
