package generics;

import java.util.HashMap;

//public class Employee implements Comparable{
//	String name;
//	int id;
//	
//	public Employee(String name,int id) {
//		this.name = name;
//		this.id = id;
//	}
//	
//	
//	public String toString() {
//		return "name: "+name+" id: "+id;
//		
//	}
//
//
//	@Override
//	public int compareTo(Object o) {
//		Employee e = (Employee) o;
//		return this.id-e.id;
//	}
//}
//public class Employee<T,K>{
//	T data1;
//	K data2;
//	
//	Employee(T data1, K data2){
//		this.data1 = data1;
//		this.data2 = data2;
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [data1=" + data1 + ", data2=" + data2 + "]";
//	}
//	
//	public static void main(String[] args) {
////		Employee e1 = new Employee(10,"Hello"); //-->here data type is not specified, it will consider as object type
////		System.out.println(e1.data2 instanceof String);
////		Employee<Integer> e1 = new Employee<Integer>(10,20); //--> if one is string throw compile time error cuz datatype is specified which is integer
////		System.out.println(e1);
////		System.out.println(e1.data1 instanceof Integer);
//		
////		Employee<String> e2 = new Employee<>("A","B"); 
//		Employee<Integer,String> e = new Employee<>(20,"Hello");
//		HashMap<Integer,String> hmp = new HashMap<>();
//		hmp.put(10, "Hello");
//		System.out.println(hmp.get(10));
//		System.out.println(e.data1 instanceof Object);
//		//--> we can perform arithmetic operation after cresting object
//		System.out.println(e.data1+e.data2);
//	}
//}

public class Employee<T>
{
	T data1;
	T data2;
	
	Employee(T data1, T data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	
	@Override
	public String toString() {
		return "Employee [data1=" + data1 + ", data2=" + data2 + "]";
	}
	
	public static <T> void print(T[] arr) {
		for(T i:arr) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Integer[] arr1 = {1,2,3,4,5};
		String[] arr2 = {"Hello","India"};
		print(arr1);
		print(arr2);
	}
	
}