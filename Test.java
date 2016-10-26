import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("HelloWorld!");
		Person p = new Person("Ali");
		Student st = new Student("Hassan");
		Person stToPerson = new Student("Mussa");
		System.out.println(p);
		System.out.println(st);
		System.out.println(stToPerson);


	}
}

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "This is Person : name is " + getName();
	}
}

class Student extends Person {
	Student(String name) {
		super(name);
	}
	@Override
	public String toString() {
		return "This is Student : name is " + getName();
	}
}

interface OnClick {
	void print();
}
