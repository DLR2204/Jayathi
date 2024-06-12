package java8;

@FunctionalInterface
interface Car {
	public void name();
}

public class Audi {

	public static void main(String[] args) {

		Car obj = new Car() {
			public void name() {
				System.out.println("The car name is Audi");
			}
		};

		obj.name();
		
		//Lambda Expression :- ()->{}
		Car obj1 = ()->System.out.println("The car name is Benz");
		
		obj1.name();
		

	}

}
