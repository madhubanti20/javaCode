package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
//		String path = "C:\\Users\\User\\Desktop\\FileDemo\\Madhu.txt";
//		String path = "C:\\Users\\User\\Desktop\\FileDemo\\Demo.txt";
		String path = "C:\\Users\\User\\Desktop\\FileDemo";

		File file = new File(path);
		
		//rename folder
//		String renamePath = "C:\\Users\\User\\Desktop\\FileDemo\\SpiderMan";
//		
//		File rename  = new File(renamePath);
//		file.mkdir();
//		file.mkdirs();
//		file.renameTo(rename);
//		System.out.println(file.getName());
//		System.out.println(rename.getName());
//		rename.delete();
		
		//create file
//		file.createNewFile();
		System.out.println(file.getAbsolutePath());
		
//
		String[] arr = file.list();
		for(String s: arr) {
			System.out.println(s);
		}
		
	}
}
