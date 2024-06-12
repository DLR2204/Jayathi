package exceptions;

import java.io.FileNotFoundException;

public class Throws {

	public static void calculate(int a, int b) throws ArithmeticException,FileNotFoundException{
		
		System.out.println("the division result is:-"+(a/b));
		
	}
	
	public static void main(String[] args) throws ArithmeticException, FileNotFoundException {
		
		calculate(0,0);
		
		
	}
}
