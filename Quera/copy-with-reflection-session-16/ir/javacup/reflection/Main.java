package ir.javacup.reflection;

public class Main {
	private int age;
	private int name;
	private int grade;

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
	
	public static void main(String[] args) {
	}
}

