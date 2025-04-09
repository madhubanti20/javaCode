package queueusingll;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q = new Queue();
		
		boolean flag = true;
		
		while(flag) {
			System.out.println();
			System.out.println("Enter 1 to push\nEnter 2 to display\nEnter 3 to peek\nEnter 4 to pop\nEnter 5 to check status\nEnter 6 to exist..");
			
			System.out.println("Enter your choice: ");
			
			int choice = sc.nextInt();
			switch(choice) {
			
			case 1: 
				System.out.println("Enter data: ");
				int data = sc.nextInt();
				q.enqueue(data);
				break;
				
			case 2:
				q.display();
				break;
				
			case 3:
				q.peek();
				break;
				
			case 4:
				q.dequeue();
				break;
				
			case 5: 
				boolean check = q.isempty();
				if(check) {
					System.out.println("queue is not empty");
				}else {
					System.out.println("Queue is empty..");
				}
				break;
				
			case 6: 
				flag = false;
				break;
			
			default:
				System.out.println("Invalid choice!Please enter correct choice!");
				break;
			}
		}
	}
}
