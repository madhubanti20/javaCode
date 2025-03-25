package aggregation;

public class Driver {
	 public static void main(String[] args) {
		
		 Sim sim = new Sim(123456789);
		 
		 Phone phone = new Phone("Samsung",sim);
		 
		 phone.display();
		 
		 phone = null;
		 
		 System.out.println(sim.phoneNo); //can exist independently
	}
}
