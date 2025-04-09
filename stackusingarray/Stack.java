package stackusingarray;

public class Stack {
	
	static int top = -1;
	int size;
	int[] arr;
	
	Stack(int size){
		this.size = size;
		arr = new int[size];
	}
	
	public void push(int data) {
		if(top >= arr.length-1) {
			System.out.println("Stack is overflow");
			return;
		}
		
		top++;
		arr[top] = data;
		
	}
	
	public void display() {
		if(top == -1) {
			System.out.println("stack is empty..");
			return;
		}
		
		int temp = top;
		System.out.println("Stack is: ");
		while(temp != -1) {
			System.out.print(arr[temp]+" ");
			temp--;
		}
		System.out.println();
	}
	
	public void peek() {
		if(top<0) {
			System.out.println("Stack is empty!");
			return;
		}
		System.out.println("Top most element is : ");
		System.out.println(arr[top]+" ");
		
	}
	
	public void pop() {
		if(top<0) {
			System.out.println("Stack is empty!");
			return;
		}
			System.out.println("Element deleted: ");
			System.out.println(arr[top]);
			top--;	
	}
	
	public void checkStatus() {
		if(top == -1) {
			System.out.println("stack is empty!");
		}
		else if(top == size -1) {
			System.out.println("Stack is full");
		}else {
			System.out.println("Not full yet!..");
		}
	}
}
