package oopsConcept;

public class Customer extends User{

	Customer(String id, String name) {
		super(id, name);
		
	}

	@Override
	void showProfile() {
		System.out.println("The name of customer is: "+name);
		
	}

}
