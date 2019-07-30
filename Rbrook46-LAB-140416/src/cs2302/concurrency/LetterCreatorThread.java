package cs2302.concurrency;


public class LetterCreatorThread {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program Starting");
		PrintLetters pl = new PrintLetters();
		// run asynchronously
		Thread thrLetters = new Thread();
		// the start method returns very quickly, but 
		// the run method in the PrintLetters will now run
		// concurrently with this main program
		thrLetters.start();
		Thread.sleep(20); // sleep for 500 milliseconds
		System.out.println("Program ending");

	}
	
	private static class PrintLetters implements Runnable {

		@Override
		public void run() {
			for(int i = 0; i < 30; i++) {
				for(int c = 'A'; c <= 'Z'; c++) {
					System.out.print((char)c);
				}
				System.out.println();
			}
			
		}
		
	}

}
