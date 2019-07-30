package cs2302.accounts.programs;

import cs2302.accounts.Account;
import cs2302.accounts.FeeForTransactionAccount;
import cs2302.accounts.InterestBearingAccount;
import cs2302.accounts.Person;
import cs2302.accounts.Portfolio;

public class ExamplePortfolio {
	
	/**
	 * Create several accounts and return them
	 * in a Portfolio.
	 * 
	 * @return A portfolio of example accounts.
	 */
	public static Portfolio create() {
		Person alice = new Person("Alice", "cust-001", "alice@acme.com");
		Person bob = new Person("Bob", "cust-002", "bob@nadir.com");
		Person chloe = new Person("Chloe", "cust-003", "chloe@zenith.com");
		Person dan = new Person("Dan", "cust-004", "dan@acme.com");
		Person eve = new Person("Eve", "cust-005", "eve@nadir.com");
		Person frank = new Person("Frank", "cust-006", "frank@zenith.com");
		Portfolio prtf = new Portfolio();
		Account acc1 = new Account(alice, "acct-101", 500);
		FeeForTransactionAccount acc2 = new FeeForTransactionAccount(bob, "acct-102", 500, .50, .10);
		InterestBearingAccount acc3 = new InterestBearingAccount(chloe, "acct-103", 500, .06);
		Account acc4 = new Account(dan, "acct-104", 500);
		FeeForTransactionAccount acc5 = new FeeForTransactionAccount(eve, "acct-105", 500, .45, .25);
		InterestBearingAccount acc6 = new InterestBearingAccount(frank, "acct-106", 500, .12);
		prtf.addAccount(acc1);
		prtf.addAccount(acc2);
		prtf.addAccount(acc3);
		prtf.addAccount(acc4);
		prtf.addAccount(acc5);
		prtf.addAccount(acc6);
		return prtf;
	}

}
