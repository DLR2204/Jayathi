package oops;

interface Parent2{
	public int add(int a,int b);
	
} 
interface Parent3{
	
	public int add(int a,int b);
}

public class Child3 implements Parent2,Parent3{

	@Override
	public int add(int a, int b) {
		return (a+b);
	}
	
	public static void main(String[] args) {
		 Child3 obj = new Child3();
		 
		System.out.println(obj.add(4, 5));
	}

}
