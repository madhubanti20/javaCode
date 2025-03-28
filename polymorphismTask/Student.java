package polymorphismTask;

public class Student extends Person{
	
	private int studentId;

	public Student(String name, int age, int id) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.studentId = id;
	}
	
	public void displayStudentInfo() {
		System.out.println("Student info: ");
		super.displayInfo();
		System.out.println(" "+this.studentId);
	}

}
