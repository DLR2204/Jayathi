package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\jayathi.txt");
		
		fw.write(1234);
		
		fw.write("good \n morning");
		
		char ch[] = {'a','b','c','d'};
		
		fw.write(ch);
		
		fw.flush();
		
		fw.close();
		
		System.out.println("The data is written successfully");
		
	}
	
	//it can't read integer values
	//it don't have a new line option
}
