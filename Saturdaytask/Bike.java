package Saturdaytask;

public class Bike extends AbstractVehicle{

	public Bike(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("Bike is Starting......");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike has been stopped....");
		
	}
	
	@Override
	public void displayType() {
		System.out.println("Its a retro styled,cruiser type bike.");
	}
}
