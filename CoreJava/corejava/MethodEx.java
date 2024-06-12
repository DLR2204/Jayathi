package corejava;

public class MethodEx {
	
	public void display() {		//instance --void
		
		System.out.println("What the hell is matter with this java classes!!!!");
	}
	
	
	public static int add(int a,int b) {	//static ---int
		
		return (a+b);
	}

	public static void main(String[] args) {
		
		MethodEx obj = new MethodEx();	//object creation
		
		obj.display();		//method call
		
		System.out.println(MethodEx.add(2, 5));
		
	}
}
