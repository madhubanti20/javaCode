package comparableAndComparatorInterface;

public class PersonDriver {
	public static void main(String[] args) {
		Person p1 = new Person("Rohit",24);
		Person p2 = new Person("Rohit",26);
		
		if(p1.compareTo(p2)>0) {
			System.out.println("p1 is greater");
		}else if(p1.compareTo(p2)<0) {
			System.out.println("P2 is greater");
		}else {
			System.out.println("Both same");
		}

	}
}
