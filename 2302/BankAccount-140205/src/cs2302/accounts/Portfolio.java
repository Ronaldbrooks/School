package cs2302.accounts;

import java.util.ArrayList;

/**
 * A portfolio is a collection of accounts.
 * The portfolio allows managing which accounts are kept in the portfolio.
 * The portfolio provides reports on the status of the accounts in the portfolio.
 * 
 * @author Ben
 *
 */
public class Portfolio {

	private ArrayList<Account> accounts;
	
	public Portfolio() {
		accounts = new ArrayList<>();
	}
	
	/**
	 * Return the number of accounts currently stored in the portfolio.
	 * @return The number of accounts currently in the portfolio.
	 */
	public int getNumberOfAccounts() {
		return accounts.size();
	}
	
	/**
	 * Return the account at index i.
	 * 
	 * @param i Should be between 0 (inclusive) and getNumberOfAccounts() (exclusive)
	 * 
	 * @return The account at index i.
	 */
	public Account getAccountAt(int i) {
		return accounts.get(i);
	}
	
	/**
	 * Add the account acct to the end of the portfolio.
	 * 
	 * 
	 */
	public void addAccount(Account acct) {
		if(accounts.contains(acct)) {
			// if the account is in the portfolio, ignore the operation
		} else {
			accounts.add(acct);
		}
	}
	
	
	/**
	 * Remove the account acct from the portfolio.
	 * @param acct  The account should be in the portfolio.
	 */
	public void removeAccount(Account acct) {
		accounts.remove(acct);
	}
	
	/**
	 * Return true if the portfolio contains the account acct.
	 *
	 * @return True if the portfolio contains acct and false otherwise.
	 */
	public boolean contains(Account acct) {
		return accounts.contains(acct);
	}
	
	public double getTotalBalance() {
		double total = 0.0;
		for(Account acct: accounts) {
			total += acct.getBalance();
		}
		return total;
	}
	
	
}
