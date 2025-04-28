package oopsConcept;

public class Driver extends User{
	
	private boolean available;

	Driver(String id, String name) {
		super(id,name);
		this.available = true;
	}
	
	
	@Override
	void showProfile() {
		System.out.println("The name of driver is : "+name);
		
		boolean availability = isAvailable();
		if(availability) {
			System.out.println("Driver is available.");
		}else {
			System.out.println("Driver is not available.");
		}
		
	}
	
	boolean isAvailable() {
		if(available) {
			return true;
		}	
		else {
			return false;
		}
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}


}
