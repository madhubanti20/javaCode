package treeSet;

public class Employee implements Comparable<Employee>{
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return  (int) (this.salary-o.salary);
	}
	
	
}
