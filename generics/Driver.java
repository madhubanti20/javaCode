package generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
		Student<Person> student = new Student<Person>(new Person(10,"Rohit"));
			
		printDetails(student );
		
		List<Integer> list = new ArrayList<>();
//		List<Boolean> list = new ArrayList<>(); // -->boolean is not child type of Number 
		list.add(10);
		list.add(20);
		print(list);
		printData(list);
		
		List<Number> ls = new ArrayList<>();//-->object also can be accepted but not integer, short, double etc..
		ls.add(10);
		ls.add(20);
		printList(ls);
		printData(ls);
	}
	
	
//--> extends
	public static void printDetails(Student<? extends Person> student) {
		Person p = student.obj;
//		student.obj = new Person(10,"Ram");//--> we can only read but not write
		System.out.println(p);
	}
	
	public static void print(List <? extends Number> list) {
//		list.add(11);//-->can not write
		System.out.println(list.get(1));
	}
	
	//--> super
	public static void printList(List<? super Number> ls) {
		ls.add(11);
		System.out.println(ls.get(0));
		System.out.println(ls.get(2));	
	}
	
	public static void printData(List<?> list) {
//		list.add(22); //-->we can not add/write, only write
		System.out.println(list);
	}
}
