package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImage {
	public static void main(String[] args) throws IOException {
		String destPath = "C:\\Users\\User\\Desktop\\FileDemo\\image.jpg";
		File destFile = new File(destPath);
		destFile.createNewFile();
		
		//read
		String srcPath = "C:\\Users\\User\\Downloads\\java.jpg";
		File srcFile = new File(srcPath);
		
		
		FileInputStream fis = new FileInputStream(srcFile);
		byte[] arr = new byte[(int) srcFile.length()]; 
		fis.read(arr);
		
		
		//write
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(arr);
		
		fos.close();
		fis.close();
	}
}
