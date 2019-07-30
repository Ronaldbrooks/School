package cs2302.accounts2;

/**
 * Account is the base class of a family of classes representing
 * various types of bank accounts.
 * 
 * The balance of an account may be accessed but only changed through the
 * methods 'deposit' and 'withdraw'.
 * 
 * @author Ben Setzer
 *
 */
public class Account {

	private Person owner;
	private String accountId;
	private double balance;
	
	/**
	 * Initialize the properties of this object with the values of
	 * the parameters.
	 * If the owner is not known, use the value null.
	 * 
	 */
	public Account(Person owner, String accountId, double balance) {
		super();
		this.owner = owner;
		this.accountId = accountId;
		this.balance = balance;
	}
	
	/**
	 * Set the Account id.
	 * Otherwise, do no initialization beyond the default.
	 * 
	 */
	public Account(String accountId) {
		this.accountId = accountId;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getAccountId() {
		return accountId;
	}


	public double getBalance() {
		return balance;
	}

	
	
	/**
	 * Deduct 'amount' from the balance if the amount is
	 * positive and less than or equal to the balance.
	 * 
	 * @param amount  Should be positive and no bigger than the current balance.
	 */
	public void withdraw(double amount) {
		if(isValidWithdrawal(amount)) {
			balance -= amount;
		} else {
			// do nothing, but we should throw an exception
		}
	}
	
	/**
	 * Determine if there are sufficient funds in the account to cover
	 * the withdrawal.
	 * Also check that the amount is positive.
	 * 
	 * @param amount Should be no less than 0.
	 * @return True if the account can cover the given withdrawal, false if not.
	 */
	public boolean isValidWithdrawal(double amount) {
		return amount > 0 && amount <= balance;
	}
	
	
	/**
	 * Add 'amount' to the balance if the amount is positive.
	 * 
	 * @param amount  Should be positive.
	 */
	public void deposit(double amount) {
		if(isValidDeposit(amount)) {
			balance += amount;
		} else {
			// do nothing, but we should throw an exception
		}
	}
	
	/**
	 * Determine if there are sufficient funds in the account to cover
	 * the deposit.
	 * Also check that the amount is positive.
	 *  
	 *  
	 * @param amount
	 * @return
	 */
	public boolean isValidDeposit(double amount) {
		return amount > 0;
	}
	
	/**
	 * Process any jobs that have to be done at the end of a month.
	 * This will be called by the system tracking accounts once each month.
	 */
	public void endOfMonthProcess() {
		// nothing for plain accounts
	}
	
	
	
	
}
