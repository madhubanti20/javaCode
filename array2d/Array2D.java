package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
	 public static void main(String[] args) {
		
		int[][] array = createArray(); 
		maxElement(array);
			 
	}
	 
	 private static void maxElement(int[][] arr) {
		int max=arr[0][0];
		
		int row =arr.length;
		
		for(int i =0;i<arr.length;i++) {
			 for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			 }
		 }
		System.out.println("The maximum value is : "+ max);
		
		
	}

	public static int[][] createArray() {
		 Scanner sc= new Scanner(System.in);
		 
		 System.out.println("Enter row : ");
		 int row=sc.nextInt();
		 
		 System.out.println("Enter col : ");
		 int col = sc.nextInt();
		 
		 int arr[][]= new int[row][col];
		 System.out.println("Enter elements : ");
		 for(int i =0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 arr[i][j]=sc.nextInt();
			 }
		 }
		 
		 System.out.println("The array is : ");
		 for(int[] i:arr) {
			 for(int j:i) {  
				 System.out.print(j +" ");
			 }
			 System.out.println();
		 }
		return arr;
	 }
}
