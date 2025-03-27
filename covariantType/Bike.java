package covariantType;

public class Bike extends Vehicle{
	
//	public Bike getObject() {
//		return new Bike();
//		
//	}
//	
//	public Vehicle getObject() {
//		return new Bike();
//		
//	}
	
	public Vehicle getObject() {
		return new Vehicle();
		
	}
	
	
	public Bike get() {
		return new Bike();
		
	}

}
