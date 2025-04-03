package exception;

public class ATM {

	private int pin;
	private double balance;

	public ATM(int pin,double amount) {
		this.pin = pin;
		this.balance = amount;
	}

	public void transaction(int pin, double amount) throws InsufficientTransaction {
		if (this.pin == pin) {
			if (balance < amount) {
				throw new InsufficientTransaction("Insufficient amount");
			} else {
				balance -= amount;
				System.out.println(amount + " is withdraw");
			}

		} else {
			throw new InvalidPinException("Invalid pin");
		}
	}
	
	public void checkBalance(int pin) throws InvalidPinException {
		if (this.pin == pin) {
			System.out.println("Current balance is : "+this.balance);
		}else{
			throw new InvalidPinException("Invalid pin");
		}
	}
}
