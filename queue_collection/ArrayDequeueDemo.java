package queue_collection;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {
	public static void main(String[] args) {
		
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.addFirst(20);
		ad.add(10);
		ad.add("Hello");
		System.out.println(ad);
		System.out.println(ad.getLast());
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		ad.offer("Madhu");
		ad.addLast(10);
		System.out.println(ad);
		ad.removeLastOccurrence(10);
		System.out.println(ad);
	}
}
