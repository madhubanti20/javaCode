package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class ReadingData {
	public static void main(String[] args) throws IOException {
		String path ="C:\\Users\\User\\Desktop\\FileDemo\\Madhu.txt";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);
		
		int x;
		while((x = fis.read()) != -1) {
			System.out.print((char)x);
		}
	}
}
