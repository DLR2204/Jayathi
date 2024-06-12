package collections;
//Set:-

import java.util.Comparator;

//it will not allow duplicates
//alphabetical order

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet(new MyOrder());

		ts.add("egg");

		ts.add("dog");

		ts.add("apple");

		ts.add("cat");

		ts.add("boll");
		

		System.out.println(ts);
	}

}

class MyOrder implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2) ;
	}
	
}
