package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileDemo\\serializable.txt";
		File file = new File(path);
		
		file.createNewFile();
		
		Employee emp = new Employee(1,"Rohit",24);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		oos.flush();
		
		oos.close();
		fos.close();
		
	}
}
