package cs2302.accounts.programs;

import cs2302.accounts.Account;
import cs2302.accounts.FeeForTransactionAccount;
import cs2302.accounts.InterestBearingAccount;
import cs2302.accounts.Person;

public class ExampleAccounts {
	
	/**
	 * Create several accounts and return an array
	 * with those accounts.
	 * 
	 * @return An array of example accounts.
	 */
	public static Account[] createAccounts() {
		Person alice = new Person("Alice", "cust-001", "alice@acme.com");
		Person bob = new Person("Bob", "cust-002", "bob@nadir.com");
		Person chloe = new Person("Chloe", "cust-003", "chloe@zenith.com");
		Person dan = new Person("Dan", "cust-004", "dan@acme.com");
		Person eve = new Person("Eve", "cust-005", "eve@nadir.com");
		Person frank = new Person("Frank", "cust-006", "frank@zenith.com");
		Account acc1 = new Account(alice, "acct-101", 500);
		FeeForTransactionAccount acc2 = new FeeForTransactionAccount(bob, "acct-102", 500, .50, .10);
		InterestBearingAccount acc3 = new InterestBearingAccount(chloe, "acct-103", 500, .06);
		Account acc4 = new Account(dan, "acct-104", 500);
		FeeForTransactionAccount acc5 = new FeeForTransactionAccount(eve, "acct-105", 500, .45, .25);
		InterestBearingAccount acc6 = new InterestBearingAccount(frank, "acct-106", 500, .12);
		Account[] accounts = {acc1, acc2, acc3, acc4, acc5, acc6};
		return accounts;
	}

}
