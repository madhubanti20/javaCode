package comparableAndComparatorInterface;

import java.util.Arrays;

public class Dog implements Comparable{
	String name;
	int age;
	 String breed;
	
	public Dog(String name,int age,String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}

	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Dog d = (Dog) o;
		if(this.name.compareToIgnoreCase(d.name) !=0) {
			return this.name.compareToIgnoreCase(d.name);
		}else if((this.age - d.age) !=0) {
			return this.age - d.age;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Dog[] arr = new Dog[3];
		Dog d1 = new Dog("Doggo",3,"Golden Retrievier");
		Dog d2 = new Dog("Chicku",6,"Labrador");
		Dog d3 = new Dog("Gucci",5,"Pit Bull");
		
		arr[0]=d1;
		arr[1]=d2;
		arr[2]=d3;
		CompareByBreed cb = new CompareByBreed();
	
		Arrays.sort(arr,cb );
		for(Dog a: arr) {
			System.out.println(a);
		}
//		System.out.println(arr[0]);

	}

	
}
