package cs2302.accounts.programs;

import cs2302.accounts.Account;

/**
 * Demonstrate polymorhphism with a transfer funds method.
 * 
 * @author Ben Setzer
 *
 */
public class TransferFunds {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	/**
	 * Transfer funds from the fromAccount to the toAccount.
	 * 
	 * @param fromAccount
	 * @param toAccount
	 * @param amount
	 */
	public static void transferFunds(Account fromAccount, Account toAccount, double amount) {
		if(amount > 0) {
			
		} else {
			// do nothing, but should throw an exception.
		}
	}

}
