package list;

import java.util.ArrayList;

public class ArrayListMethods {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		arr.add(0, 75);
		arr.add('c');
		System.out.println(arr);

		ArrayList list = new ArrayList(arr);
		list.add(11);
		list.add(12);
		list.add(13);
//		list.addAll(arr);
		list.add(null);
		list.add("Hello");
		System.out.println(list);
//		System.out.println(list.size());

		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add("world");
		System.out.println(al);

//		arr.addAll(1, al);
//		System.out.println(arr);
		
		//add normally at last 
		arr.add(al);
		System.out.println(arr);

		// add at particular index
		arr.add(1,al);
		System.out.println(arr);

//		arr.addFirst(90);
//		arr.addLast(100);
//		System.out.println(arr);

		// fetch
		System.out.println(arr.get(0));

		// clear
		System.out.println(al.size());
		al.clear();
		System.out.println(al.size());

		// remove at index or ovbject
		System.out.println(arr.remove(0));
		System.out.println(arr.remove("world"));
		System.out.println(arr);
		
		//remove integer value,need to autobox, for character also same process
		Integer x = 10;
		System.out.println(arr.remove(x));
		System.out.println(arr);
		
		Character ch = 'c';
		System.out.println(arr.remove(ch));
		
		System.out.println(arr.toArray());
	}
}
