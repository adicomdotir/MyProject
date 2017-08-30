package ir.javacup.shop;

public class YaldaDiscountStrategy implements DiscountStrategy {
	@Override
	public long priceByDiscount(Clothing clothing) {
		if (clothing instanceof Jacket) {
			return clothing.getBasePrice() - clothing.getBasePrice() * 10 / 100;
		} else if (clothing instanceof Socks) {
			return clothing.getBasePrice() - clothing.getBasePrice() * 20 / 100;
		} else {
			return clothing.getBasePrice() - clothing.getBasePrice() * 25 / 100;
		}
	}
}