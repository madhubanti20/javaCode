package polymorphismTask;


public class Driver {
	public static void main(String[] args) {
		Student s = new Student("Madhu",23,11);
		
		Professor p = new Professor("Trisha",24,"cst");
		
		University u = new University();
		u.addPerson(s);
		u.addPerson(p);
		u.showPeople();
	}

}
