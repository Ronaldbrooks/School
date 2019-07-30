package cs2302.concurrency;

public class LetterCreator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Program Starting");
		PrintLetters pl = new PrintLetters();
		// run the method synchronously
		// we will wait for the 'run' method to finish
		pl.run();
		System.out.println("Program ending");

	}
	
	private static class PrintLetters implements Runnable {

		@Override
		public void run() {
			for(int i = 0; i < 3; i++) {
				for(int c = 'A'; c <= 'Z'; c++) {
					System.out.print((char)c);
				}
				System.out.println();
			}
			
		}
		
	}

}
