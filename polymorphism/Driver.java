package polymorphism;

public class Driver {

	public static void main(String[] args) {

		Employee e = new FullTimeEmployee("Madhu", 1000.00, 1500);
		e.employeeInfo();

		((FullTimeEmployee) e).jobRole();

//		 String role =  ((FullTimeEmployee)e).jobRole();
		System.out.println("...................................................");

		Employee emp = new PartTimeEmployee("Trisha", 1000.00, 6);
		emp.employeeInfo();

		((PartTimeEmployee) emp).jobDesignation();
		
//		Employee e1 = new Employee(null, 0);
//		((PartTimeEmployee)e1).jobDesignation();
//		
		System.out.println("................................");
		details(emp);
		
	}
	
	static void details(Employee e) {
		
		if( e instanceof FullTimeEmployee) {
			e.jobRole();
		}else {
			 e.jobRole();
			((PartTimeEmployee)e).jobDesignation();
		}
		
	 }
}
