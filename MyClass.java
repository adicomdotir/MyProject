public class MyClass {
	public static void main(String[] args) {
		System.out.println("HelloWorld");
		System.out.println("HelloWorld");
		new Person().setName("Name");
	}
}

class Person {
	private String name;
	public Person() {
		
	}
	public void setName(String name) {
		this.name = name;
	}
}
