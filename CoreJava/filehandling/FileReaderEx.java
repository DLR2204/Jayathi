package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Desktop\\Jayathi.txt");
	
		int values = fr.read();
		
		
		while(values!=-1) {
			System.out.println((char)values);
			values= fr.read();
		}
	}
}
