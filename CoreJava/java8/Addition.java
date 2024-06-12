package java8;

@FunctionalInterface
interface Calculator{
	
	public void add(int a,int b);
	
}

public class Addition implements Calculator{
	
	public static void main(String[] args) {
		
		Addition obj = new Addition();
		
		obj.add(2, 5);
	}

	@Override
	public void add(int a, int b) {
		System.out.println("Iam from the Addition class");
		System.out.println("The sum of the inputs are:-"+(a+b));
	}

}
