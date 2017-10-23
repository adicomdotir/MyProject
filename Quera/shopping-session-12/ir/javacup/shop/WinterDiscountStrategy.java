package ir.javacup.shop;

public class WinterDiscountStrategy implements DiscountStrategy {
	@Override
	public long priceByDiscount(Clothing clothing) {
		long price = clothing.getBasePrice();
		if (clothing instanceof Jacket) {
			price -= price * 10 / 100;
		}
		if (clothing.getSeason() == Season.SUMMER) {
			price -= price * 25 / 100;
		} else if (clothing.getSeason() == Season.FALL) {
			price -= price * 40 / 100;
		} else if (clothing.getSeason() == Season.WINTER) {
			price -= price * 50 / 100;
		} 
		return price;
	}
}