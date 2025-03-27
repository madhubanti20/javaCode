package inheritencePractice;

public class Bike extends Vehicle{
	
	boolean hasGear ;

	public Bike(String number,String brand,String model,double price,boolean available,boolean gear) {
		super(number,brand,model,price,available);
		this.hasGear = gear;
	}
	
	public void displayDetails() {
		
		super.rentVehicle();
		super.displayDetails();
		System.out.println(" "+this.hasGear);
	}

}
