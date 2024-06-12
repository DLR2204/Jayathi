package oops;

interface Parent1 {			//parent class

	public void display();		//parent class - abstract,instance method

	public int add(int a, int b); //parent class- abstract,instance

}

public class Child1 implements Parent1{		//child class

	@Override
	public void display() {		//parent class implemented method

		System.out.println("Iam from the child class");
	}

	@Override
	public int add(int a, int b) {//parent class implemented method

		
		return 0;
	}
	
	public static void main(String[] args) {
		
		Child1 obj = new Child1();
		
		obj.display();
	}

}
