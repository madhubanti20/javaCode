package composition;

public class Phone {
	
	String phone;
	Battery b;

	public Phone(String phName, String batteryName) {
		
		this.phone = phName;
		
		this.b = new Battery(batteryName);
	}

	public void display() {
		
		System.out.println(phone+"\n"+b.phBattery);
		
	}
	
	

}
