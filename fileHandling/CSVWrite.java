package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWrite {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileDemo\\studentData.csv";
		File file = new File(path);
		file.createNewFile();
		
		
		try(FileWriter writer = new FileWriter(file)){
			writer.append("id,name,age\n");
			writer.append("1,Rohit,25\n");
			writer.append("2,Neha,30\n");
			writer.append("3,Arav,28\n");
			
			System.out.println("CSV file written successfully");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
