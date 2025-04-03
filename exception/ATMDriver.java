package exception;

public class ATMDriver {
	public static void main(String[] args) throws Exception  {
		ATM atm = new ATM(1234,1000.00);
//		try {
//			atm.checkBalance(1243);
//		} catch (InvalidPinException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			atm.transaction(1234, 1200.00);
//		} catch (InsufficientTransaction e) {
//			System.out.println(e.getMessage());
//
//		} catch (InvalidPinException e) {
//			System.out.println(e.getMessage());
//
//		}
		
		atm.checkBalance(1243);
		atm.transaction(1234, 200.00);
		atm.checkBalance(1234);
	}

}
