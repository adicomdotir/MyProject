package ir.javacup.toyfactory;

public class Toy {
	private double basePrice;
	protected ToySize size;
	
	public Toy(double basePrice, ToySize size) {
		this.basePrice = basePrice;
		this.size = size;
	}
	
	public double getPrice() {
		if(size == ToySize.SMALL)
			return basePrice;
		if(size == ToySize.MEDIUM)
			return basePrice * 1.5;
		return basePrice * 2;
	}
	
	public double getPrice(double discount) {
		return getPrice() - getPrice() * discount / 100;
	}
	
	public double getBasePrice() {
		return this.basePrice;
	}
}

enum ToySize {
	SMALL,
	MEDIUM,
	LARGE
}
