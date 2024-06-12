package oops;

class Parent8 {
	public void marriage() {
		System.out.println("Child needs to marry KAJOL");
	}
}

public class Child7 extends Parent8 {

	public static void main(String[] args) {
		Child7 obj = new Child7();

		obj.marriage();
	}
	
	@Override
	public void marriage() {
		System.out.println("Child needs to marry DEEPIKA");
	}
}
