package ir.javacup.io;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CourseUtilImpl implements CourseUtil {
	
	private List<Grade> gradeList;

	@Override
	public void setOutputStream(ByteArrayOutputStream out) {
		gradeList = new ArrayList<>();
		String[] lines = new String(out.toByteArray()).split(System.getProperty("line.separator"));
		for (String line: lines) {
			String[] temp = line.split(" ");
			Grade grade = new Grade();
			grade.setStudentId(temp[0]);
			grade.setCourseCode(Integer.parseInt(temp[1]));
			grade.setScore(Double.parseDouble(temp[2]));
			gradeList.add(grade);
		}
	}

	@Override
	public Grade load(int lineNumber) {
		if (lineNumber >= count()) return null;
		Grade grade = gradeList.get(lineNumber - 1);
		return grade;
	}

	@Override
	public void save(Grade grade) {
		gradeList.add(grade);
	}

	@Override
	public double calcCourseAverage(int courseCode) {
		double sum = 0;
		int count = 0;
		for (Grade grade: gradeList) {
			if (grade.getCourseCode() == courseCode) {
				sum += grade.getScore();
				count++;
			}
		}
		return sum / count;
	}

	@Override
	public double calcStudentAverage(String studentId) {
		double sum = 0;
		int count = 0;
		for (Grade grade: gradeList) {
			if (grade.getStudentId().equals(studentId)) {
				sum += grade.getScore();
				count++;
			}
		}
		return sum / count;
	}

	@Override
	public int count() {
		return gradeList.size();
	}

}
