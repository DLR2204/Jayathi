package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Jayathi.txt");
		
		ObjectInputStream obj = new ObjectInputStream(file);
		
			Employee emp = (Employee) obj.readObject();
			
			System.out.println(emp);
		
	}

}
