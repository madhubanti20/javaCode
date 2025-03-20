package calculator;

import java.util.Scanner;

public class Calculator {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Do you want any more operation?\nPress 1 for yes and 0 for no");
		int operation = sc.nextInt();
//		String operation=sc.next();
//		
//		switch(operation) {
//			case 1:CalculatorApp.addOperation();
//					break;
//			case 2:CalculatorApp.subtractOperation();
//					break;
//			case 3:CalculatorApp.multiplicationOperation();
//					break;
//			case 4:CalculatorApp.divisionOperation();
//					break;
//			default:System.out.println("Invalid choice");
//		}
//		int cal;
		while (operation != 0) {
			System.out.println(
					"Enter the menu no which you want to perform:\n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				CalculatorApp.addOperation();
				break;
			case 2:
				CalculatorApp.subtractOperation();
				break;
			case 3:
				CalculatorApp.multiplicationOperation();
				break;
			case 4:
				CalculatorApp.divisionOperation();
				break;
			default:
				System.out.println("Invalid choice");
			
			}
			System.out.println("Do you want any more operation?\nPress 1 for yes and 0 for no");
			operation = sc.nextInt();
		}
//		do{
//			System.out.println("Enter the menu no which you want to perform:\n 1.Add\n 2.Subtract\n 3.Multiply\n 4.Divide");
//			int choice=sc.nextInt();
//			switch(choice) {
//				case 1:CalculatorApp.addOperation();
//						break;
//				case 2:CalculatorApp.subtractOperation();
//						break;
//				case 3:CalculatorApp.multiplicationOperation();
//						break;
//				case 4:CalculatorApp.divisionOperation();
//						break;
//				default:System.out.println("Invalid choice");
//			}
//			System.out.println("Do you want any more operation?\nPress 1 for yews and 0 for no");
//			 cal=sc.nextInt();
//			
//		}while(cal!=0);	
//		
		
	}

}
