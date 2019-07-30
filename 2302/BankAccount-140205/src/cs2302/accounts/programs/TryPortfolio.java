package cs2302.accounts.programs;

import cs2302.accounts.Portfolio;

public class TryPortfolio {

	
	public static void main(String[] args) {
		Portfolio prt = ExamplePortfolio.create();
		System.out.println("Total balance: " + prt.getTotalBalance());
	}

}
