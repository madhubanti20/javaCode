package objectClass;

public class Driver {
	public static void main(String[] args) {
		
//		Employee e = new Employee(101, "madhu", 1000.00);
//		System.out.println(e);
//		System.out.println(e.toString());
//		Object o = e.clone();
//		System.out.println(o);
		
		Student s = new Student("Madhu",2,"F",100.00);
		
		Student s1 = new Student("Madhu",1,"F",100.00);
		System.out.println(s.toString());
		
		System.out.println(s.hashCode());
		
		System.out.println(s.equals(s1));
	}
}
