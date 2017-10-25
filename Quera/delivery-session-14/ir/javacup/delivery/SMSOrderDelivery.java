package ir.javacup.delivery;

import java.util.*;

public class SMSOrderDelivery implements OrderDelivery {
    private List<Order> coll = new ArrayList<>();

    public Order getCurrentOrder() {
        Order order = null;
        if (coll.size() > 1) {
            order = coll.remove(coll.size() - 1);
        }
        return order;
    }
	
	public void takeNewOrder(Order order) {
		boolean isInList = false;
		for (int i = 0; i < coll.size() && isInList == false; i++) {
			if (order.equals(coll.get(i))) {
				isInList = true;
				order = coll.get(i);
			}
		}
        if (coll.contains(order)) {
            coll.remove(order);
            coll.add(order);
        } else {
            coll.add(order);
        }
    }
	
	public Collection<Order> getOrders() {
        return this.coll;
    }
}