package collections;


//List:-
//(1)Duplicate are allowed
//(2)Insertion ordered
//(1)Array size can be changed ,even after declaring it.
//(2)it will allows both heterogenous/ homogenous data
//(3)Lot's utility methods.



import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();

		ll.add(123);

		ll.add("String");

		ll.add('c');

		ll.add(3.14f);

		ll.add(true);

		System.out.println(ll);

		ll.add(123);

		ll.add("String");

		ll.add('c');

		ll.add(3.14f);

		ll.add(true);

		System.out.println(ll);

	}

}
