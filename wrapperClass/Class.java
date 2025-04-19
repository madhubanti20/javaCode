package wrapperClass;

public class Class {
	public static void main(String[] args) {
		int a =10;
//		Integer a1 =10; //auto boxing
//		Integer x = a;
//		Integer y = Integer.valueOf(a); //boxing
//		Integer z = new Integer(a); //--> boxing using constructor
		System.out.println(a);
//		System.out.println(z);
		
		byte b =2;
		Byte b1 = Byte.valueOf(b); 
//		int b3 = b1.byteValue(); //-->unboxing
		int b2 = b1; //auto unboxing
		System.out.println(b2);
		
		Integer m =10;
		int n = m.intValue(); //--> unboxing
		System.out.println(n);
		
		Integer madhu =10;
		System.out.println(m == madhu);

	}
}
