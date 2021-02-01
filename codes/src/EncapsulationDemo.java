// Encapsulation is binding Data with Methods

// Can maintain a log file
// To check the other fields such as isLogin or not etc.
class Student{
	private int rollno;
	private String name;
	// Getters and Setters
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollno;
	}
	public String getName() {
		return name;
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setName("Soham");
		s1.setRollNo(51);
		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());
		
	}

}
