package strings;

public class NonSync implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}

	}

	public static void main(String[] args) {
		NonSync obj = new NonSync();
		
		Thread  thread = new Thread(obj);
		
		thread.start();					//run method calling

		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
	}

}
