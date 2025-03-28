package oopsTask;

public class PayPal extends Payment{

	public PayPal(double amount, String id) {
		super(amount,id);
		
	}

	@Override
	void processPayment() {
		double amount = super.getAmount();
		double discount = super.discount(amount);
		double fee = amount *  0.03;

		double payment = (amount - discount) + fee;
		
		System.out.println("Paypal payment pocssing.....");
		System.out.println("Transaction id: " + super.getTransactionId() + " original amount: " + amount + " discount: "
				+ discount + " fee: " + fee + " final payble amount: " + payment);
		System.out.println("Payment successful!");
	}

}
