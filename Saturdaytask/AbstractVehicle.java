package Saturdaytask;

public abstract class AbstractVehicle implements Vehicle {

	protected String name;
	protected int speed;

	public AbstractVehicle(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	@Override
	public void accelerate(int increment) {
		this.speed = this.speed + increment;
		System.out.println("Speed has been increased by: "+this.speed);
	}

	@Override
	public void brake(int decrement) {
		this.speed = this.speed - decrement;
		System.out.println("Speed has been decreased by: "+this.speed);
	}

	@Override
	public void getCurrentSped() {
		System.out.println("Current speed is: " + this.speed);

	}

	public void displayDetails() {
		System.out.println("Name of vehicle: " + this.name + " Speed of vehicle: " + this.speed);
	}
	
	public void displayType() {
		
	}

}
