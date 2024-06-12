package corejava;

public class Instance {

	static String staticcounter = "Indian"; // static global var

	int Aadhar; // instance global var

//	void counter() {
//		
//		staticcounter++;
//		
//		instancecounter++;
//		
//	}

	void display() {
		System.out.println("StaticCounter :- " + staticcounter);

		System.out.println("Aadhar :- " + Aadhar);
	}

	public static void main(String[] args) {

		Instance obj1 = new Instance();

		Instance obj2 = new Instance();

		Instance obj3 = new Instance();

		obj1.Aadhar = 123243;

		obj2.Aadhar = 234234;

		obj3.Aadhar = 5609856;

		obj1.display();

		obj2.display();

//		obj1.counter();
//		
//		obj2.counter();
//		
//		obj3.counter();
//		
		obj3.display();

	}

}
