package polymorphism;

public class PartTimeEmployee extends Employee{
	
	private int workingTime;
	

	public PartTimeEmployee(String name, double salary, int workingTime) {
		super(name, salary);
		this.workingTime = workingTime;
	}
	
	public void employeeInfo() {
		System.out.println("Part time employee details: ");
		super.employeeInfo();
		System.out.println(" workingTime: "+this.workingTime);
	}
	
	public void jobDesignation() {
		System.out.println("Job designation of part-time employee is sassociate software engineer");
	}
	
	public void jobRole() {
		System.out.println("Job role of part-time employee is cloud engineer");
	}

}
