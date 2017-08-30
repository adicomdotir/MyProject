package ir.javacup.shop;

public class WinterDiscountStrategy implements DiscountStrategy {
	@Override
	public long priceByDiscount(Clothing clothing) {
		if (clothing.getSeason() == Season.SUMMER) {
			if (clothing instanceof Jacket) {
				long newPrice = clothing.getBasePrice() - clothing.getBasePrice() * 25 / 100;
				return newPrice - newPrice * 10 / 100;
			} else {
				return clothing.getBasePrice() - clothing.getBasePrice() * 25 / 100;
			}
		} else if (clothing.getSeason() == Season.FALL) {
			if (clothing instanceof Jacket) {
				long newPrice = clothing.getBasePrice() - clothing.getBasePrice() * 40 / 100;
				return newPrice - newPrice * 10 / 100;
			} else {
				return clothing.getBasePrice() - clothing.getBasePrice() * 40 / 100;
			}
		} else if (clothing.getSeason() == Season.WINTER) {
			if (clothing instanceof Jacket) {
				long newPrice = clothing.getBasePrice() - clothing.getBasePrice() * 50 / 100;
				return newPrice - newPrice * 10 / 100;
			} else {
				return clothing.getBasePrice() - clothing.getBasePrice() * 50 / 100;
			}
		} else {
			if (clothing instanceof Jacket) {
				return clothing.getBasePrice() - clothing.getBasePrice() * 10 / 100;
			} else {				
				return clothing.getBasePrice();
			}
		}
	}
}