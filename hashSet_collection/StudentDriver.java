package hashSet_collection;

import java.util.HashSet;

public class StudentDriver {
	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student(1,"Madhu");
//		Student s2 = new Student(2,"Anu");
		Student s2 = new Student(2,"Anurima");
		Student s3 = new Student(3,"Shrabo");
//		Student s4 = new Student(1,"Anu");
		Student s4 = new Student(4,"Anurima");
		

		
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.add(s4);
		System.out.println(hs);

	}
}
