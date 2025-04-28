package oopsConcept;

import java.util.Iterator;
import java.util.List;

@SecurityCheck(role = "Admin")
public class Admin extends User{

	Admin(String id, String name) {
		super(id, name);
		
	}
	
	Class<SecurityCheck> c = SecurityCheck.class;
	SecurityCheck s = c.getDeclaredAnnotation(SecurityCheck.class);
	

	@Override
	void showProfile() {
		System.out.println("Name od admin is : "+name+", Role is : "+s.role());
		
	}
	
	public void removeDriver(List<Driver> drivers, String driverId) {
		if(c.isAnnotationPresent(SecurityCheck.class)) {
			Iterator<Driver> it = drivers.iterator();
			while(it.hasNext()) {
				
				Driver d = it.next();
				if(d.id == driverId) {
					it.remove();
					System.out.println("Driver removed successfully...");
					return;
				}
			}
		}
		
		
	}

}
