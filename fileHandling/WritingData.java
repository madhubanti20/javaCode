package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException{
		String path ="C:\\Users\\User\\Desktop\\FileDemo\\Madhu.txt";
		File file = new File(path);
//		FileOutputStream fos = new FileOutputStream(file,true);
		FileWriter fw = new FileWriter(file,true);
		
		String msg = "I am not coming tomorrow";
//		byte[] arr = msg.getBytes();
//		fos.write(arr);
		
		BufferedWriter bw = new BufferedWriter(fw);
		for(int i =0;i<msg.length();i++) {
			bw.write(msg.charAt(i));
		}
		
		bw.flush();
		bw.close();
		fw.close();
	}
}
