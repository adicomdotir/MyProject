public class Main {
	public static void main(String[] args) {
		Course course = new Course();
		course.register(new Student("Ali", 18));
		course.register(new Student("Ali", 20));
		course.register(new Student("Ali", 22));
		System.out.println(course.getNumOfStudents());
		System.err.println(course.getNumOfStudents());
		
	}
}
