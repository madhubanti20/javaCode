package inheritencePractice;

public class Car extends Vehicle{
	int numberOfDoor;
	
	public Car(String number,String brand,String model,double price,boolean available,int door) {
		// TODO Auto-generated constructor stub
		super(number,brand,model,price,available);
		this.numberOfDoor = door;
	}
	
	public void displayDetails() {
		
		super.rentVehicle();
		super.displayDetails();
		System.out.println(" "+this.numberOfDoor);
	}

}
