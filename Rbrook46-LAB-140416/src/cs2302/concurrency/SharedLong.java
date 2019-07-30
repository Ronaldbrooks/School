package cs2302.concurrency;

/**
 * Two threads will update a shared variable
 * The expected and actual results will be compared
 * 
 * @author rbrook46
 *
 */

public class SharedLong {

	public static void main(String[] args) {
		A runnableA = new A();
		B runnableB = new B();
		Thread thrA = new Thread(runnableA);
		Thread thrB = new Thread(runnableB);
		thrA.start();
		thrB.start();
		System.out.println("Final value of x is " + x );
		System.out.println("Expected value of x is 26");
	}
	
	 private static long x = 23; // shared variable
	 
	 private static class A implements Runnable {
		 
		@Override 
		public void run () {
			long y = x;
			x = y + 1;
			x = y;
		}
	 }
	 
	 private static class B implements Runnable {
		 
		 @Override
		 public void run() {
			 long z = x;
			 z = z + 2;
			 x = z;
		 }
	 }
}
