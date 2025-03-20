package array2d;

import java.util.Scanner;

public class SymmetricArray {
	public static void main(String[] args) {
		int[][] array = createArray(); 
		checkSymmetric(array);
	}
	
	private static void checkSymmetric(int[][] arr) {
		boolean flag = true;
		int row =arr.length;
		
		for(int i =0;i<arr.length;i++) {
			 for(int j=i;j<arr[i].length;j++) {
				if(arr[i][j]!=arr[j][i]) {
					flag=false;
					break;
				}
			 }
		 }
		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		
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
