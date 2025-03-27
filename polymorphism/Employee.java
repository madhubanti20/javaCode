package polymorphism;

public class Employee {
	
	private String name;
	private double salary;
	
	public Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public void employeeInfo() {
		System.out.print("Name is: "+this.name+" ,salary is: "+this.salary);
	}
	
	public void jobRole() {
		
	}
	
//	static void details(PartTimeEmployee emp) {
//		 emp.jobRole();
//		 emp.jobDesignation();
//	 }
	
	
	
}
