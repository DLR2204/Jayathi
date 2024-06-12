package java8;

public class Maths {

	public static void main(String[] args) {

		Calculator obj = new Addition()::add;

		obj.add(2, 10);

		
		
	}

}
