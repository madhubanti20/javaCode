package exception;

public class ExceptionPropagation {
	public static void main(String[] args) {
		alpha();
	}

	public static void alpha() {
		System.out.println("This is alpha");
		beta();
	}

	public static void beta() {
		System.out.println("This is beta");
		gamma();
	}

	public static void gamma() {
		System.out.println("This is gamma");
		try {
			System.out.println(10/0);
			System.out.println("end of gamma"); //--> it will not get execute...
		}catch(ArithmeticException e ) {
			System.out.println("arithmetic Exception , number can not be divided by zero...~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("end of gamma");
		}
		System.out.println("end of gamma");
		
	}
}
