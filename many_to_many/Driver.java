package many_to_many;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
		
		Student s1 = new Student("Madhu",3);
		Student s2 = new Student("Anu",2);
		
		Course c1 = new Course("Java",3);
		Course c2 = new Course("Python",4);
		Course c3 = new Course("Aiml",2);
		
		s1.addCouse(c1);
		s1.addCouse(c2);
		s1.addCouse(c3);
		
		s2.addCouse(c1);
		
		System.out.println(Arrays.toString(s1.arr)+" "+Arrays.toString(s2.arr));


		
	}
}
