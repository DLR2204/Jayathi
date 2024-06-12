package corejava;

public class ConstructorEx1 {
	
	public ConstructorEx1() {
		this("apple");				//constructor calling
	}
	
	public ConstructorEx1(String name) {
		this("boll","cat");				// 2 params contr calling
		System.out.println(name);
	}
	
	public ConstructorEx1(String name,String name1) {
		this("den","egg","fish");		// 3 params constr calling
		
		System.out.println(name +" "+name1);
	}
	
	public ConstructorEx1(String name,String name1,String name2)
	{
		System.out.println(name + " "+name1 +" "+name2);
	}
	
	public static void main(String[] args) {
		ConstructorEx1 obj = new ConstructorEx1();		//default constr
	}
}
