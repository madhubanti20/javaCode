package stackusingll;

public class Stack {
	Node top;
	static int count;
	
	public void push(int data) {
		Node node = new Node(data);
		
		if(top == null) {
			top = node;
			count++;
			return;
		}
		node.next = top;
		top = node;
		count++;
	}
	
	public void display() {
		if(top == null) {
			System.out.println("Sack is empty!");
			return;
		}
		
		Node temp = top;
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	public void peek() {
		if(top == null) {
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Top most element is : ");
		System.out.println(top.data);
		
	}

	public void pop() {
		if(top == null) {
			System.out.println("Stack is empty!");
			return;
		}
		
		Node temp = top;
		System.out.println("Data deleted: "+temp.data);
		top = top.next;
		temp.next = null;
		
	}

	public boolean checkStatus() {
		if(top != null) {
			return true;
		}
		return false;
	}
}
