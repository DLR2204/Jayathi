package oops;

interface Child6 {					//100%
	public void display();
}

abstract class Child5 {		//(0%-100%)

	public abstract void display();

	public void add() {
		System.out.println("the sum");
	}

}

public class Child4 {			//0%

	public void display() {

		System.out.println("hello everyone!!!");
	}

}
