package linkedlist_collection;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	
	Employee(int id,String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
}
