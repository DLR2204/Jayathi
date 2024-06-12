package filehandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterEx {
	
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("C:\\Users\\PRADEEP GOUD\\Desktop\\Jayathi.txt");
		
		pw.println("Good \n morning");
		
		pw.println(1234);
		
		pw.println(true);
		
		pw.println(3.14f);
		
		char []ch = {'a','b','c','d'};
		
		pw.println(ch);
		
		pw.flush();
		
		pw.close();
		
		System.out.println("Data is written into the file successfully");
	}

}
