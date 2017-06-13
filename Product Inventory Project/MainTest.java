import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product(1,1500,9));
		Inventory inventory = new Inventory(1, list);
		inventory.addProduct(new Product(2,1100,5));
		System.out.println(inventory.sumProducts());
	}
}