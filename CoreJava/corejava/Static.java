package corejava;

public class Static {
	
	static String name = "jayathi"; //static global var
	
	String user = "apple";	//instance global var
	
	
	public static void main(String[] args) {
		
	System.out.println(Static.name);
	
	System.out.println(name);
	
	Static obj = new Static();
	
	System.out.println(obj.user);
	
	
	
	
		
	}

}
