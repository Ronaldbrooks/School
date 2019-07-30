package cs2302.accounts;

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
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			// TODO: do nothing, but we should throw an exception
		}
	}
	
	/**
	 * Returns true to indicate that it is valid to withdraw
	 * the given amount from this account.
	 * 
	 * @return True if it is valid to withdraw the amount, false
	 * 			if it is not.
	 */
	public boolean isValidToWithdraw(double amount) {
		return amount > 0 && amount <= balance;
	}
	

	
	/**
	 * Add 'amount' to the balance if the amount is positive.
	 * 
	 * @param amount  Should be positive.
	 */
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		} else {
			// do nothing, but we should throw an exception
		}
	}

	/**
	 * Return true if it is valid to deposit the amount to this account.
	 * 
	 * @return  True if it is valid to deposit this amount, false if not.
	 */
	public boolean isValidToDeposit(double amount) {
		return amount > 0;
	}
	
	
	/**
	 * Process any jobs that have to be done at the end of a month.
	 * This will be called by the system tracking accounts once each month.
	 */
	public void endOfMonthProcess() {
		// nothing for plain accounts
	}
	
	/**
	 * Transfer the specified amount of funds from this account
	 * to 'toAcct'.
	 * 
	 * @param toAcct
	 * @param amount Should be positive
	 */
	public void transfer(Account toAcct, double amount) {
		/**
		 * A transfer is an ATOMIC operation, that is, it should fully succeed
		 * or fully fail but nothing in between.
		 */
		if(this.isValidToWithdraw(amount) && toAcct.isValidToDeposit(amount)) {
			/* we hope nothing bad happens before we carry out the operations */
			this.withdraw(amount);
			toAcct.deposit(amount);
		} else {
			System.out.println("Either the withdrawal or the deposit was invalid");
		}
	}
	
	
}











