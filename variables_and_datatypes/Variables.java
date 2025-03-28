package variables_and_datatypes;

public class Variables {
	static int a =50;

	public static void main(String[] args) {
//		System.out.println(a);
		int a =10;;
//		System.out.println(a);//errpor
//		System.out.println(Variables.a);
		{
//			int a=50; -->
//			a=20;
			int b=30;
//			System.out.println(a); 20 o/p
//			System.out.println(b);
			System.out.println(Variables.a);

		}
		//System.out.println(b);  //-->error cuz b is initialize inside block
	}

}


