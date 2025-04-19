package queue_collection;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.add(10);
//		pq.add(null); //--> null pointer exception
//		pq.add("Hello"); //---> class cast exception
		pq.add(20);
		pq.add(40);
		pq.add(11);
		pq.add(8);
		System.out.println(pq);
	}
}
