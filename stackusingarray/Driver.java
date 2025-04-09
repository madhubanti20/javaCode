package stackusingarray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		 int size = sc.nextInt();
		Stack s = new Stack(size);
		
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
				s.push(data);
				break;
				
			case 2:
				s.display();
				break;
				
			case 3:
				s.peek();
				break;
				
			case 4:
				s.pop();
				break;
				
			case 5: 
				s.checkStatus();
				break;
				
			case 6: 
				flag = false;
				break;
			
			default:
				System.out.println("Invalid choice!Please enter correct choice!");
				break;
			}
		}
		
//		Stack s = new Stack(5);
//		s.push(1);
//		s.push(2);
//		s.push(3);
//		s.push(4);
//		s.push(5);
//		s.push(6);
//	
//		
//		s.display();
//		s.peek();
//		s.pop();
		
	}
}
