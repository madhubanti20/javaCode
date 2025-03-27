package inheritencePractice;

public class Driver {
	
	public static void main(String[] args) {
		
		Bike b = new Bike("1234","Enfield","V4",200.00,false,true);
		b.displayDetails();
		
		Car c = new Car("7777","Thar","V10",200.00,true,4);
		c.displayDetails();
	}
}
