package oopsConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class RideBookingSystem {
	List<Customer> customers = new ArrayList<>();
	List<Driver> drivers = new ArrayList<>();
	List<Ride> rides = new ArrayList<>();
	
	public void registerCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void registerDriver(Driver driver) {
		drivers.add(driver);
	}
	
	public Ride bookRide(Customer customer) {
		Optional<Driver> driv = drivers.stream().filter(d ->d.isAvailable() == true).findFirst();
		
		if(driv.isPresent()) {
			Driver driver = driv.get();
			
		}
	
		

		return null;
	}
}
