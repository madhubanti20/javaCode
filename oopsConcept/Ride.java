package oopsConcept;

public class Ride {
	private Customer customer;
	private Driver driver;
	private String status;
	
	Ride(Customer customer, Driver driver){
		this.customer = customer;
		this.driver = driver;
		this.status = "Booked";
	}
	
	public void completeRide() {
		this.status = "Completed";
		driver.setAvailable(true);
	}
	
	public String getStatus() {
		System.out.println("Current status of ride is : "+status);
		return status;
	}
	
	public String rideDetails() {
		return "Details of Ride is : "+" Customer Name: "+customer.name+" ,Driver name: "+ driver.name+",Current status is: "+status;
	}
}
