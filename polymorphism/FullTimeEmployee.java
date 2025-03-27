package polymorphism;

public class FullTimeEmployee extends Employee{
	
	private int bonus;
	
	public FullTimeEmployee(String name, double salary,int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}
	
	public void employeeInfo() {
		System.out.println("Full time employee details: ");
		super.employeeInfo();
		System.out.println(" bonus is: "+this.bonus);
	}

	public void jobRole() {
		System.out.println("Job role of fulltime employee is Developer");
	}
}
