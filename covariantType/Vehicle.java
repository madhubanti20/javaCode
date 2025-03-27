package covariantType;

public class Vehicle {
	
	public Vehicle getObject() {
		return new Vehicle();
	}
	
	public Bike get() {
		return (Bike) new Vehicle();
	}
}
