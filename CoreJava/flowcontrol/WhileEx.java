package flowcontrol;

public class WhileEx {

	public static void main(String[] args) {

		int i = 11;
		
		System.out.println(i++);
		
		System.out.println(++i);

		while (i < 15) {
			
			System.out.println(i);

			--i; 
		}
		
		System.out.println("*************");
//
//		do {
//			System.out.println(i);
//
//			i++;
//		} while (i > 15);

	}

}
