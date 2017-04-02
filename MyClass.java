public class MyClass {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(c1);
		Circle c2 = new Circle(2.0, "Blue");
		System.out.println(c2);
		Rectangle r = new Rectangle();
		System.out.println(r);
		Employee e = new Employee(1, "Ali", "Hassani", 750);
		System.out.println(e);
		InvoiceItem i = new InvoiceItem("A001", "Battery", 6, 3.89);
		System.out.println(i);
		Account a = new Account("Account001", "Adicom", 7500);
		System.out.println(a);
	}
}
