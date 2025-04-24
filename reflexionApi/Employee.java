package reflexionApi;

public class Employee {
	private String name;
	private int id;
	private int age;
	private double salary;
	
	Employee(String name,int id,int age,double salary){
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	
	@Deprecated
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String toString() {
		return this.id+" "+this.name+" "+this.age+" "+this.salary;
	}
	
}
