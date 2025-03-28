package oopsTask;

public abstract class Payment {
	
	abstract void processPayment();
	private double amount;
	private String transactionId;
	
	public Payment(double amount,String id) {
		this.setAmount(amount);
		this.setTransactionId(id);
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public double discount(double amount) {
		// TODO Auto-generated method stub
		double discount = 0;
		if(amount>500) {
			discount = amount * 0.1;
		}
		
		return discount;
		
	}
	
	
}
