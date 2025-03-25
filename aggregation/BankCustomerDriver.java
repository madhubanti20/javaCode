package aggregation;

public class BankCustomerDriver {

	public static void main(String[] args) {
		
		Customer c = new Customer("Madhu");
		
		Bank b = new Bank("Central Bank of India", c);
		
		b.display();
	}
}
