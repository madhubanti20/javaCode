package hashSet_collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(null);
		hs.add("Hello");
		hs.add(null); //-->duplicates not allow
		System.out.println(hs);
		
		


	}
}
