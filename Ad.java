public class Ad {
	public static void main(String[] args) {
		System.out.println("Hello Ubuntu!" 
			+ new Person("Lili") 
			+ new Person("Ali")
		);
	}
}

class Person {
	String name;
	Person(String str) {
		name = str;
	}
	@Override
	public String toString() {
		return "Name:" + name;
	}
}
