package collections;

import java.util.ArrayList;

//List:-

//(1)Duplicate are allowed
//(2)Insertion ordered
//(1)Array size can be changed ,even after declaring it.
//(2)it will allows both heterogenous/ homogenous data
//(3)Lot's utility methods.



public class ArrayListEX {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);

		al.add("String");

		al.add('c');

		al.add(3.14f);

		al.add(true);

		System.out.println(al);

		al.add(123);

		al.add("String");

		al.add('c');

		al.add(3.14f);

		al.add(true);
		
		System.out.println(al);
		
		al.add(3, "jayathi");
		
		System.out.println(al);
		
		System.out.println(al.get(4));

	}

}
