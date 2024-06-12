package oops;
class GrandParent{
	public void displayMsg() {
		System.out.println("Iam from GrandParent");
	}
}


class Parent extends GrandParent{
	
	public void display() {
		System.out.println("Iam from Parent class!!!");
	}
	public int add(int a,int b) {
		return (a+b);
	}
}

public class Child extends Parent{
	
	public static void main(String[] args) {
		
		Child obj = new Child();
		
		obj.display();
		
		System.out.println(obj.add(3, 1));
		
		obj.displayMsg();
	}

}
