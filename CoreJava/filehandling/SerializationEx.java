package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream("C:\\Users\\PRADEEP GOUD\\Desktop\\Jayathi.txt");
	
		Employee emp = new Employee("Jayathi",123,23947,"hyderabad");
		
		ObjectOutputStream obj = new ObjectOutputStream(file);
		
		
		obj.writeObject(emp);
		
		System.out.println("data is converted into byte data");
		
	
	}

}
