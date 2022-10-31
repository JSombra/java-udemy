package modulo14.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" $ ");
        sb.append(String.format("%.2f",totalPrice()));
        sb.append(" (Customs fee: $ ");
        sb.append(String.format("%.2f",getCustomsFee()));
        sb.append(")");
        return sb.toString();
    }
}
