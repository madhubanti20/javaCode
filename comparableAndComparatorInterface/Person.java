 package comparableAndComparatorInterface;

public class Person implements Comparable{
	private String name;
	private int age;
	
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person)o;
		
		if(this.name.compareToIgnoreCase(p.name) !=0) {
			return this.name.compareToIgnoreCase(p.name);
		}else if((this.age - p.age) !=0) {
			return this.age - p.age;
		}
		return 0;
	}
	
	
}
