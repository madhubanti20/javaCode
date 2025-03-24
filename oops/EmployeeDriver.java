package oops;

public class EmployeeDriver {
	public static void main(String[] args) {
		 Employee e = new Employee(101, "Raj", "Abc" ,10000.00);
		 Employee e1 = new Employee(102, "Anuj", "Xyz" ,20000.00);
		 
		 System.out.println(e.id+ " " +e.name+" "+e.cmpName+" "+e.salary);
		 
		 System.out.println(e1.id+ " " +e1.name+" "+e1.cmpName+" "+e1.salary);
		
	}
}
