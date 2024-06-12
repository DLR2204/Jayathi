package collections;
//Set:-
//insertion order
//it will not allows duplicates
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("apple");
		
		lhs.add("flower");
		
		lhs.add("fruits");
		
		lhs.add(1234);
		
		lhs.add(true);
		
		lhs.add(3.14f);
		
		System.out.println(lhs);
		
		
	}

}
