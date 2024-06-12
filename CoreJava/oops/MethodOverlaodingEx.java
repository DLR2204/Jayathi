package oops;

public class MethodOverlaodingEx {
	
	public void add(int a, int b) {
		System.out.println("6.The sum of two int are:- "+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("9.The sum of three int are :-"+(a+b+c));
	}
	public void add(int a,float b) {
		System.out.println("12.The sum of a int, float is:-"+(a+b));
	}
	public void add(float a,int b) {
		System.out.println("15.The sum of a float, int is:-"+(a+b));
	}
	public void add(float a,float b) {
		System.out.println("18.The sum of a float, float is:-"+(a+b));
	}

	public static void main(String[] args) {
		MethodOverlaodingEx obj = new MethodOverlaodingEx();
		
		obj.add('a','c');
		
		
		
	}
}
