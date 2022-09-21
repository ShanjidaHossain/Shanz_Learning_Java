package encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStName("Shanjida");
		student.setStId(23028152);
		student.setSex('f');
		student.setGrade(4.0f);
		student.setFulltime(true);
		
		System.out.println("Name: " + student.getStName() + 
									"\nEMPLID: " + student.getStId() + 
									"\nGender: " + student.getSex() +
									"\nGrade: " + student.getGrade() + 
									"\nFull time status: " + student.isFulltime());	
		
	}

}
