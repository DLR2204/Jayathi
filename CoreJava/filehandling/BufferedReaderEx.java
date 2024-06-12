package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\PRADEEP GOUD\\Music\\DailyNotesJayathi.txt");
		
		BufferedReader br = new  BufferedReader(fr);
		
		String data = br.readLine();
		
		while(data!=null) {
			System.out.println(data);
			
			data = br.readLine();
		}
		
		System.out.println("File is read successfully");
		
	}

}
