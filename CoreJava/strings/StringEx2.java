package strings;

public class StringEx2 {

	public static void main(String[] args) {
		String name = "apple";

		String name1 = "apple";

		System.out.println(name == name1);// boolean-true

		System.out.println(name.equals(name1));// boolean - true

		System.out.println(name.compareTo(name1)); // int -1

		System.out.println(name.equalsIgnoreCase(name1));// boolean -true

		String name3 = new String("apple");

		String name4 = new String("apple");

		System.out.println("-------------------------------------------");
		System.out.println(name3 == name4);// boolean-false

		System.out.println(name3.equals(name4));// boolean - true

		System.out.println(name3.compareTo(name4)); // int -0

		System.out.println(name3.equalsIgnoreCase(name4));// boolean -true
		
		

	}

}
