package flowcontrol;

public class SwitchEx {
	
	public static void main(String[] args) {
		
		float mm = 600f;
		
		float om =150f;
		
		float percentage =(om/mm)*100;
		
		System.out.println("Your percentage is --->"+percentage+"%");
		
		int gpa = (int) ((percentage/10)%10) ;
		
		
		System.out.println("your gpa is --->"+gpa);
		
		System.out.print("Your grade is --->");
		
		switch(gpa) {
			
		case 10: {
			System.out.println("Distinction");
			break;
		}
		case 9 :{
			System.out.println("Excellent");
			break;
		}
		case 8 :{
			System.out.println("very good");
			break;
		}
		case 7 :{
			System.out.println("good");
			break;
		}
		case 6 :{
			System.out.println("Average");
			break;
		}
		case 5 :{
			System.out.println("Improve well");
			break;
		}
		case 4 :{
			System.out.println("poor");
			break;
		}
		
		default :{
			
			System.out.println("Fail");
			
			break;
		}
		
		
		
		}
		
		
	}

}
