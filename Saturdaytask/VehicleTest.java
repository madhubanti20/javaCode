package Saturdaytask;

public class VehicleTest {
	public static void main(String[] args) {

		AbstractVehicle av = new Car("Mahindra Thar Roxx", 155);

		av.displayDetails();
		av.start();
		av.accelerate(10);
		av.brake(20);
		av.stop();
		av.getCurrentSped();
		av.displayType();
		System.out.println("..........................................");
		
		AbstractVehicle ab = new Bike("Enfield", 50);

		ab.displayDetails();
		ab.start();
		ab.accelerate(10);
		ab.brake(20);
		ab.stop();
		ab.getCurrentSped();
		ab.displayType();
		System.out.println("..........................................");
		
		AbstractVehicle at = new Truck("Loaded Truck", 80);
		
		at.displayDetails();
		at.start();
		at.accelerate(10);
		at.brake(20);
		at.stop();
		at.getCurrentSped();
		at.displayType();
	}
}
