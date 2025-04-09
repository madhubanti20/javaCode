package stackusingll;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Stack s = new Stack();
		
		boolean flag = true;
		
		while(flag) {
		
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
				boolean check = s.checkStatus();
				if(check) {
					System.out.println("Stack is not empty!");
				}else {
					System.out.println("stack is empty");				}
				break;
				
			case 6: 
				flag = false;
				System.out.println("stack ends here....");
				break;
			
			default:
				System.out.println("Invalid choice!Please enter correct choice!");
				break;
			}
		}
	}
}
