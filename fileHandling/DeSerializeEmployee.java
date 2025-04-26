package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
	public static void main(String[] args) throws Exception {
		String path = "C:\\Users\\User\\Desktop\\FileDemo\\serializable.txt";
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee)ois.readObject();
		System.out.println(e);
	}
}
