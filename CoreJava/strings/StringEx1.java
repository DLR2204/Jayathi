package strings;

public class StringEx1 {
	
	public static void main(String[] args) {
		
		String name = "Hyderabad ";
		
//		System.out.println(name.concat("Biryani"));
		
		name.concat("Biryani");
		
		System.out.println(name);
		
		String name1 = new String("Jayathi");
		
		System.out.println(name1);
		
		StringBuffer name2 = new StringBuffer("Hyderabad ");
		
		System.out.println(name2);
		
		name2.append("Biryani");
		
		System.out.println(name2);
		
		
		
	}

}
