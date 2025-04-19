package lambda_expression;


import java.util.*;

public class Driver {
	public static void main(String[] args) {
		ArrayList<EmployeeDriver> li = new ArrayList<EmployeeDriver>();
		li.add(new EmployeeDriver(1,"Madhu"));
		li.add(new EmployeeDriver(3,"Trisha"));
		li.add(new EmployeeDriver(2,"Shreyanshi"));
		li.add(new EmployeeDriver(4,"Shrabo"));
		
//		Comparator<Object> c = (o1,o2)->((EmployeeDriver)o1).name.compareTo(((EmployeeDriver)o2).name);
		Comparator<EmployeeDriver> c = (o1,o2)->o1.name.compareTo(o2.name);
		Comparator<EmployeeDriver> c1 = (o1,o2)->o1.id-o2.id;

		Collections.sort(li,c1);
		System.out.println(li);
		
		
		
	}
}
