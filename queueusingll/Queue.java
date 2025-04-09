package queueusingll;

public class Queue {
	Node front;
	Node rear;
	
	public void enqueue(int data) {
		Node node = new Node(data);
		
		if(front == null && rear == null) {
			front = node;
			rear = node;
			return;
		}
		rear.next = node;
		rear = node;

	}
	
	public void display() {
		if(front == null && rear == null || front == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("The elements are: ");
		Node temp = front;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		
	}

	public void peek() {
		if(front == null && rear == null || front == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.println("Front element is: "+front.data);
		
	}

	public void dequeue() {
		if(front == null && rear == null  || front == null) {
			System.out.println("Queue is empty");
			return;
		}
		
		Node temp = front;
		System.out.println("Data deleted: "+temp.data);
		front = front.next;
		temp.next = null;
		
	}

	public boolean isempty() {
		if(front != null && rear != null || front != null) {
			return true;
		}
		return false;
	}
}
