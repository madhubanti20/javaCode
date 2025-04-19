package linkedlist_collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;



public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.add(10);
		li.add('c');
		li.add("Hello");
		li.add(null);
		li.add(10);
		
		li.addFirst(11);
		System.out.println(li);
		System.out.println(li.peek());
		System.out.println(li.peekFirst());
		System.out.println(li.peekLast());
		li.set(0, 'm');
		System.out.println(li);
		
		
//		ListIterator list = li.listIterator();
//		
//		while(list.hasNext()) {
//			System.out.println(list.next());
//		}
		
		LinkedList<Employee> emp = new LinkedList<>();
		emp.add(new Employee(1,"Madhu"));
		emp.add(new Employee(4,"Arisha"));
		emp.add(new Employee(3,"Shreyanshi"));	
		
//		Collections.sort(emp,new CompareEmployee());
//		System.out.println(emp);
		
		ListIterator list = emp.listIterator();
//		
		while(list.hasNext()) {
			System.out.println(list.next());
		}
	}
}
