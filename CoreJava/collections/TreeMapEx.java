package collections;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {
	public static void main(String[] args) {
	TreeMap<Integer,String> tree = new TreeMap<Integer,String>();
	
	tree.put(100, "apple");
	
	tree.put(155, "flower");
	
	tree.put(144, "fruits");
	
	tree.put(164, "animals");
	
	tree.put(153, "birds");
	
	tree.put(174, "fauna");
	
	tree.put(134, "trees");
	
	System.out.println(tree.get(155));
	
	Set set = tree.keySet();
	
	System.out.println(set);
	
	for(Object values : set) {
		System.out.println(values +"\t"+ tree.get(values));
	}
	
	
	}
}
