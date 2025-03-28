package oopsTask;

import java.util.Scanner;

public class CreditCard extends Payment {

//	private double discount;



	
	public CreditCard(double amount, String id) {
		super(amount, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	void processPayment() {

		double amount = super.getAmount();
		double discount = super.discount(amount);
		double fee = amount *  0.02;

		double payment = (amount - discount) + fee;
		
		System.out.println("Credit card payment pocssing.....");
		System.out.println("Transaction id: " + super.getTransactionId() + " original amount: " + amount + " discount: "
				+ discount + " fee: " + fee + " final payble amount: " + payment);
		System.out.println("Payment successful!");
	}

}
