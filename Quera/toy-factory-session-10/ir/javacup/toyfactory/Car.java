package ir.javacup.toyfactory;

public class Car extends Toy {
	public Car(double basePrice, ToySize size) {
		super(basePrice, size);
	}
	
	@Override
	public double getPrice() {
		if(size == ToySize.SMALL)
			return getBasePrice() * 2;
		if(size == ToySize.MEDIUM)
			return getBasePrice() * 2.5;
		return getBasePrice() * 3;
	}
}
