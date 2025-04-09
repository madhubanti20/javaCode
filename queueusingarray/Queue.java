package queueusingarray;

public class Queue {
	
	int front = -1;
	int rear = -1;
	int size;
	int[] arr;
	
	Queue(int size){
		this.size = size;
		arr = new int[size];
	}
	
	public void enqueue(int data) {
		
		if(rear+1 == size) {
			System.out.println("Queue is full..");
			return;
		}
		if(rear == -1 || front == -1) {
			rear++;
			arr[rear] = data;
			front++;
			return;
		}
		rear++;
		arr[rear]=data;
	}
	
	public void display() {
		if(rear == -1 && front == -1 || front == rear+1) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.println("the elements are: ");
		int temp = front;
		while(temp != rear+1) {
			System.out.print(arr[temp]+" ");
			temp++;
		}
		System.out.println();
		
	}
	
	public void dequeue() {
		if(rear == -1 && front == -1 || front == rear+1) {
			System.out.println("Queue is empty.");
			return;
		}
		
		System.out.print("data deleted: ");
		System.out.println(arr[front]);
		for(int i =0;i<rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		
	}
	
	public void peek() {
		if(rear == -1 && front == -1) {
			System.out.println("Queue is empty.");
			return;
		}
		System.out.print("Front element is: ");
		System.out.println(arr[front]);
	}
	
	public boolean isempty() {
		if(rear != -1 && front != -1) {
			return true;
		}
		return false;
	}

}
