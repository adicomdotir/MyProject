package ir.javacup.shop;

public class SummerDiscountStrategy implements DiscountStrategy {
	@Override
	public long priceByDiscount(Clothing clothing) {
		if (clothing.getSeason() == Season.SUMMER) {
			return clothing.getBasePrice() - clothing.getBasePrice() * 50 / 100;
		} else if (clothing.getSeason() == Season.SPRING) {
			return clothing.getBasePrice() - clothing.getBasePrice() * 40 / 100;
		} else if (clothing.getSeason() == Season.WINTER) {
			return clothing.getBasePrice() - clothing.getBasePrice() * 30 / 100;
		} else {
			return clothing.getBasePrice();
		}
	}
}