package calculator;

import java.util.Scanner;

public class CalculatorApp {
	
	public static Scanner sc = new Scanner(System.in);

	public static void addOperation() {

		System.out.println("Enter 1 for adding two numbers\nEnter 2 for adding three numbers: \n");
		
		int choice = sc.nextInt();
		switch(choice) {
		
			case 1:
					System.out.println("Enter two numbers: ");
					double num1=sc.nextDouble();
					double num2=sc.nextDouble(); 
					add(num1,num2);
					break;
					
			case 2:
					System.out.println("Enter three numbers: ");
					double num3=sc.nextDouble();
					double num4=sc.nextDouble();
					double num5=sc.nextDouble(); 
					add(num3,num4,num5);
					break;
			
			default: System.out.println("Invalid choice");
			 
		}
		 
	}

	private static void add(double num3, double num4, double num5) {
		
		System.out.println("Addition of three numbers: ");
		System.out.println(num3+num4+num5);
		
	}

	private static void add(double num1, double num2) {
		
		System.out.println("Addition of two numbers: ");
		System.out.println(num1+num2);
		
	}

	public static void subtractOperation() {
		
		System.out.println("Enter two number for subtraction: ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble(); 
		subtract(num1,num2);
	}

	private static void subtract(double num1, double num2) {
		
		System.out.println("Subtraction of two numbers: ");
		System.out.println(num1-num2);
		
	}

	public static void multiplicationOperation() {
		
		System.out.println("Enter 1 for multiply two numbers\nEnter 2 for multiply three numbers: ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1: 
					System.out.println("Enter two numbers: ");
					double num1=sc.nextDouble();
					double num2=sc.nextDouble(); 
					multiply(num1,num2);
					break;
					
			case 2:
					System.out.println("Enter three numbers: ");
					double num3=sc.nextDouble();
					double num4=sc.nextDouble();
					double num5=sc.nextDouble(); 
					multiply(num3,num4,num5);
					break;
			
			default: System.out.println("Invalid choice");
		}
		
	}

	private static void multiply(double num3, double num4, double num5) {
		
		System.out.println("Multiplication of three numbers: ");
		System.out.println(num3*num4*num5);
		
	}

	private static void multiply(double num1, double num2) {
		
		System.out.println("Multiplication of two numbers: ");
		System.out.println(num1*num2);
		
	}

	public static void divisionOperation() {
		
		System.out.println("Enter two number for division: ");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble(); 
		division(num1,num2);
		sc.close();
		
	}

	private static void division(double num1, double num2) {
		
		if(num2!=0) {
			System.out.println("Division of two numbers: ");
			System.out.println(num1/num2);
		}else {
			System.out.println("Division can not be possible");
		}
		
	}

}
