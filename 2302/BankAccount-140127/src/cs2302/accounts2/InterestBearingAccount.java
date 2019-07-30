package cs2302.accounts2;

/**
 * This kind of account earns interest each month based
 * 	on the ending balance in the account.
 * 
 * Actually, the interest earned would be based on the minimum
 * balance during the month.
 * We won't deal with that now, but may return to the issue later.
 * 
 * @author Ben Setzer
 *
 */
public class InterestBearingAccount extends Account {

	private double annualInterestRate;
	
	public InterestBearingAccount(String accountId) {
		super(accountId);
	}

	public InterestBearingAccount(Person owner, String accountId, double balance,
				double annualInterestRate ) {
		super(owner, accountId, balance);
		setAnnualInterestRate(annualInterestRate);
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		if(annualInterestRate >= 0) {
			this.annualInterestRate = annualInterestRate;
		} else {
			// do nothing, but should throw an exception
		}
	}
	
	/**
	 * Add the interest earned this month.
	 */
	public void addMonthlyInterest() {
		deposit(getBalance()*annualInterestRate/12);
	}
	
	@Override
	public void endOfMonthProcess() {
		addMonthlyInterest();
	}
	
	
}
