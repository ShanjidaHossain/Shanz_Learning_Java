package encapsulation;

public class Student {
	private String stName;
	private int stId;
	private char sex;
	private boolean isFulltime;
	private float grade;
	
	
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isFulltime() {
		return isFulltime;
	}
	public void setFulltime(boolean isFulltime) {
		this.isFulltime = isFulltime;
	}
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	
}
