package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("apple");
		
		al.add("boll");
		
		al.add("orange");
		
		al.add("watermelon");
		
		al.add("1234");
		
//		System.out.println(al);
//		
//		for(String str : al) {
//			System.out.println(str);
//		}
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			
			String name = (String) itr.next();
			
			System.out.println(name);
		}
		
		
	}
}
