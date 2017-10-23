package ir.javacup.delivery;

import java.util.*;

public class CallOrderDelivery implements OrderDelivery {
    private List<Order> coll = new ArrayList<>();

    public Order getCurrentOrder() {
        Order order = null;
        if (coll.size() > 1) {
            order = coll.remove(coll.size() - 1);
        }
        return order;
    }
	
	public void takeNewOrder(Order order) {
        if (!coll.contains(order)) {
            coll.add(order);
        }
    }
	
	public Collection<Order> getOrders() {
        return this.coll;
    }
}