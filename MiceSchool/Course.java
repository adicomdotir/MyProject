

public class Course {
	private Student[] students = new Student[10];
	private String courseName;
	private int count = 0;

	public boolean register(Student s) {
		if(count >= 10)
			return false;
		else {
			students[count] = s;
			count++;
		}
		return true;
	}

	public int getNumOfStudents() {
		return count;
	}

	public Student[] getStudents() {
		return students;
	}

	public String getName() {
		return courseName;
	}

	public void setName(String name) {
		this.courseName = name;
	}

	
}

