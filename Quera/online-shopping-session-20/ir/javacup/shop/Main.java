package ir.javacup.shop;

public class Main {
	public static void main(String[] args) {
		OrderFunctionUtilImpl func = new OrderFunctionUtilImpl();
		Order order = new Order();
		order.setState(OrderState.READY_TO_SEND);
		Product p0 = new Product();
		p0.setPrice(6_000_000);
		Product p1 = new Product();
		p1.setPrice(6_000_000);
		order.product(p0).product(p1);
		System.out.println(func.isBigOrder().apply(order));
		System.out.println(func.hasMultipleProducts().apply(order));
		System.out.println(func.hasUnavailableProduct().apply(order));
		System.out.println(func.isReadyToDeliver().apply(order));
	}
}
