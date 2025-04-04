package comparableAndComparatorInterface;

public class Employee implements Comparable{
	int id;
	 String name;
	 double salary;
	
	public Employee(int id,String name,double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		Employee e = (Employee) o;
		return this.name.compareTo(e.name);
	}
//
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee) o;
//		return (int)(this.salary - e.salary);
//	}
//	
	
}
