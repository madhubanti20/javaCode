package oops;

public class Employee {
	int id;
	String name;
	String cmpName;
	double salary;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	public Employee(int id, String name, String cmpName) {
		this(id,name);
		this.cmpName = cmpName;
	}
	
	public Employee(int id, String name, String cmpName, double salary) {
		this(id,name,cmpName);	
		this.salary = salary;
	}

	

		
	
	
}
