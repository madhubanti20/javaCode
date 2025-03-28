package polymorphismTask;

public class Professor extends Person{
	
	private String specialization;
	
	public Professor(String name, int age, String stream) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.specialization = stream;
	}
	
	public void displayProfessorInfo() {
		System.out.println("Professor info: ");
		super.displayInfo();
		System.out.println(" "+this.specialization);
	}

	
	
	
	
	
}
