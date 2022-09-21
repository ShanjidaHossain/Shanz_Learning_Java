package learning.collection.framework.list.arraylist;

public class Student2  {
	private int studentId;
	private String studentName;
	private boolean courseRegistered;

	public Student2(int studentId, String studentName, boolean courseRegistered) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseRegistered = courseRegistered;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public boolean isCourseRegistered() {
		return courseRegistered;
	}

	public void setCourseRegistered(boolean courseRegistered) {
		this.courseRegistered = courseRegistered;
	}

}