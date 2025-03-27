package inheritencePractice;

public class Vehicle {
	
	String vehicleNumber ;
	String brand;
	String model;
	double rentalPricePerDay;
	boolean isAvailable;
	
	public Vehicle(String number,String brand,String model,double price,boolean available) {
		this.vehicleNumber = number;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = price;
		this.isAvailable = available;
	}
	
	public void rentVehicle() {
		if(isAvailable) {
			System.out.println("Can rent");
		}else {
			System.out.println("Can not rent");
		}
	}
	
	public void displayDetails() {
		
		System.out.print(this.vehicleNumber+" "+this.brand+" "+this.model+" "+this.rentalPricePerDay+" "+this.isAvailable);
		
	}

}
