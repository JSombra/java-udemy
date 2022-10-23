package modulo13.entities;

import modulo13.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    private Date moment;
    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void addItems(OrderItem item){
        orderItems.add(item);
    }

    public void removeItems(OrderItem item){
        orderItems.remove(item);
    }

    public Double total(){
        double sum = 0;
        for (OrderItem oItem: orderItems){
            sum += oItem.subTotal();
        }
        return sum;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY: \n");
        sb.append("Order moment: " + sdf1.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client.getName() + " (" + sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Order items: " + "\n");
        for (OrderItem orderItem : orderItems) {
            sb.append(orderItem.getProduct().getName() + ", $" + orderItem.getProduct().getPrice() + ", Quantity: " + orderItem.getQuantity() + ", Subtotal: $" + orderItem.subTotal() + "\n");
        }
        sb.append("Total price: $" + total());
        return sb.toString();
    }
}

