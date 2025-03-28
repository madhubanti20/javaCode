package oopsTask;

import java.util.Scanner;

public class PaymentDriver {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		CreditCard cd = new CreditCard(600, "TXN12345");
//
//		cd.processPayment();
	;

		System.out.println("Enter your choice to make payment --- 1 for creditcard\n2 for paypal\n3 for exist : ");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter anount: ");
			double amount1 = sc.nextDouble();
			System.out.println("Enter transaction id: ");
			String id1 = sc.next();
			Payment p1 = new CreditCard(amount1,id1);
			p1.processPayment();
			break;
		case 2:
			System.out.println("Enter anount: ");
			double amount2 = sc.nextDouble();
			System.out.println("Enter transaction id: ");
			String id2 = sc.next();
			Payment p2 = new PayPal(amount2,id2);
			p2.processPayment();
			break;
		case 3: 
				System.out.println("Getting back");
				break;
		default: System.out.println("Incorrect choice.Please enter correct choice!");
		}
	}
}
