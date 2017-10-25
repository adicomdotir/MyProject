package ir.javacup.delivery;

import java.util.*;

public class CallOrderDelivery implements OrderDelivery {
    private List<Order> coll = new ArrayList<>();

    public Order getCurrentOrder() {
        Order order = null;
        if (coll.size() > 1) {
            order = coll.remove(0);
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
        if (!isInList) {
            coll.add(order);
        }
    }
	
	public Collection<Order> getOrders() {
        return this.coll;
    }
}