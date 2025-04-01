package Saturdaytask;

public class Truck extends AbstractVehicle{
	public Truck(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("Truck is Starting......");
		
	}

	@Override
	public void stop() {
		System.out.println("Truck has been stopped....");
		
	}
	
	@Override
	public void displayType() {
		System.out.println("This truck is used to carry goods.");
	}
}
