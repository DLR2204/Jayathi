package exceptions;

public class Throw {
	
	public static void vote(int age) {
		
		if(age<18) {
			throw new ArrayIndexOutOfBoundsException("Your age is not valid!!!!");
		}
		else {
			System.out.println("you can go to voting");
		}
		
	}
	
	public static void main(String[] args) {
		
		vote(6);
		
	}
	
	
}
