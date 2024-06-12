package collections;

//Set:-
//it's own order
//it will not allows duplicates
import java.util.HashSet;

public class HashSetEx {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("apple");
		
		hs.add("cat");
		
		hs.add("flower");
		
		hs.add(1234);
		
		hs.add(3.14f);
		
		hs.add(true);
		
		hs.add('d');
		
		System.out.println(hs);
		
		
		
	}
}
