package lab1;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Order> orders = new ArrayList<>();

    public Customer(String name, String email, int phone) {
        super(name, email, phone);
    }

    public void createOrder(Product product, int quantity) {
        Order order = new Order(this, product, quantity);
        if (Worker.confirmOrder(order) != null) {
            orders.add(order);
        }
    }

    public List<Order> getOrders() {
        return orders;
    }
}
