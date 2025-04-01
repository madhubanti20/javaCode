package Saturdaytask;

public class Car extends AbstractVehicle{

	public Car(String name, int speed) {
		super(name, speed);
		
	}

	@Override
	public void start() {
		System.out.println("Car is Starting......");
		
	}

	@Override
	public void stop() {
		System.out.println("Car has been stopped....");
		
	}
	
	@Override
	public void displayType() {
		System.out.println("Its a off roading car.....");
	}

	
	

}
