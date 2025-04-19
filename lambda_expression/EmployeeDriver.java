package lambda_expression;

public class EmployeeDriver implements Comparable<EmployeeDriver>{
	int id;
	String name;
	
	EmployeeDriver(int id,String name){
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "EmployeeDriver [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(EmployeeDriver o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}
	
	
}
