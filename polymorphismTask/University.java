package polymorphismTask;

public class University {

	Person[] people= new Person[5];
	static int count = 0;
	
//	public Univesity(int size) {
////		this.people = new Person[size];
//	}
	
	public void addPerson(Person p) {
		if(count<people.length) {
			people[count++] = p;
			System.out.println("added");
		}else {
			System.out.println("Array is full");
		}
	}
	
	public void showPeople() {
		for(int i =0;i<count;i++) {
			if(people[i] instanceof Student) {
				((Student) people[i]).displayStudentInfo();
			}else {
				((Professor) people[i]).displayProfessorInfo();
			}
		}
		
	}
}
