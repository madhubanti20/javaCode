package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class RotateImage {
	public static void main(String[] args) {
		int[][] array = createArray();
		rotateArray(array);
	}
	
	private static void rotateArray(int[][] arr) {
		 int[][] arr1 = new int[arr.length][arr[0].length];
	        int row=arr.length;
	        int col=arr[0].length;
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr[i].length;j++){
	               arr1[j][row-i-1]=arr[i][j];
	            }
	        }
	        
	        for(int i=0;i<arr.length;i++){
	            for(int j=0;j<arr[i].length;j++){
	              arr[i][j]=arr1[i][j];
	            }
	        }
	        
	        
	        System.out.println(Arrays.deepToString(arr));
		
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
