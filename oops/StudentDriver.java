package oops;

public class StudentDriver {
	public static void main(String[] args) {
		
		Student s1= new Student();
		
		s1.name = "Madhu";
		s1.clg_name = "UEM";
		s1.id = 1;
		s1.marks =8.4;
		
		System.out.println(s1.id+" "+s1.name+" "+s1.clg_name+" "+s1.marks);
		s1.study();

		System.out.println("..................................");
		
		Student s2= new Student();
		
		s1.name = "Shrabo";
		s1.clg_name = "UEM";
		s1.id = 2;
		s1.marks =8.5;
				
		System.out.println(s2.id+" "+s2.name+" "+s2.clg_name+" "+s2.marks);
		s2.study();

	}
}
