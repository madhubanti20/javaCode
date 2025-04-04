package comparableAndComparatorInterface;

public class Driver {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"MSD",500000.00);
		Employee e2 = new Employee(102,"MS",300000.00);
		compareByName(e1,e1);
		compareBySalary(e1,e2);
		compareById(e1,e2);
	}
	
	public static void compareByName(Employee e1, Employee e2) {
		if(e1.compareTo(e2)>=0) {
			System.out.println("e1 is greater..");
		}else if(e1.compareTo(e2)<0) {
			System.out.println("e2 is greater..");
		}else {
			System.out.println("both are equal..");
		}
	}
	
	private static void compareById(Employee e1, Employee e2) {
		CompareById ci = new CompareById();
		if(ci.compare(e1,e2)>=0) {
			System.out.println("e1 is greater..");
		}else if(ci.compare(e1,e2)<0) {
			System.out.println("e2 is greater..");
		}else {
			System.out.println("both are equal..");
		}
		
	}
	
	public static void compareBySalary(Employee e1, Employee e2) {
		CompareBySalary cs = new CompareBySalary();
		if(cs.compare(e1,e2)>=0) {
			System.out.println("e1 is greater..");
		}else if(cs.compare(e1,e2)<0) {
			System.out.println("e2 is greater..");
		}else {
			System.out.println("both are equal..");
		}
		
	}
}
