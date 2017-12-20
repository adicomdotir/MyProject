package ir.javacup.reflection;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName(2);
		p1.setAge(2);
		p1.setGrade(2);
		Person p2 = new Person();
		p2.setName(1);
		p2.setAge(1);
		p2.setGrade(1);
		new Copier("age", "name").copy(p1, p2);
		System.out.println(p2);
	}
}

class Person {
	public int age;
	public int name;
	public int grade;

	public void setName(int name) {
		this.name = name;
	}
	public int getName() { return name; }

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() { return age; }

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() { return grade; }

	@Override
	public String toString() {
		return "[" + name + "," + age + "," + grade + "]";
	}
}