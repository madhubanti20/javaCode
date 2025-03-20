package array2d;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
		int[][] array = createJaggedArray();

		System.out.println(Arrays.deepToString(array));
	}

	private static int[][] createJaggedArray() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter row no: ");
		int row = sc.nextInt();
		
		int[][] arr = new int[row][];	
		
		for(int i=0;i<row;i++) {
			
			System.out.println("Enter column no: ");
			int col = sc.nextInt();
			arr[i]=new int[col];
			
			for(int j=0;j<col;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		return arr;
	}
}
