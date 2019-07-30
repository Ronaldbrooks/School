package cs2302.accounts;


/**
 * This type of account charges a fee for each withdrawal and a fee
 * for each deposit.
 * 
 * @author Ben Setzer
 *
 */
public class FeeForTransactionAccount extends Account {
	
	private double withdrawalFee;
	private double depositFee;
	
	/**
	 * Set all the properties of this account, including those that are
	 * inherited from Account, using the parameter values.
	 * 
	 */
	public FeeForTransactionAccount(Person owner, String accountId, double balance,
			double withdrawalFee, double depositFee) {
		super(owner, accountId, balance);
		this.withdrawalFee = withdrawalFee;
		this.depositFee = depositFee;
	}

	/**
	 * 	Default only initialization.
	 * 
	 */
	public FeeForTransactionAccount(String accountId) {
		super(accountId);
	}
	
	public double getWithdrawalFee() {
		return withdrawalFee;
	}

	public void setWithdrawalFee(double withdrawalFee) {
		if(withdrawalFee >= 0) {
			this.withdrawalFee = withdrawalFee;
		} else {
			// do nothing, but should throw an exception
		}
	}

	public double getDepositFee() {
		return depositFee;
	}

	public void setDepositFee(double depositFee) {
		if(depositFee >= 0 ) {
			this.depositFee = depositFee;
		} else {
			// do nothing, but should throw an exception
		}
	}
	
	@Override
	public void deposit(double amount) {
		if(amount > 0 && amount + getBalance() > depositFee) {
			super.deposit(amount);
			super.withdraw(depositFee);
		} else {
			// do nothing, but should throw an exception
		}
	}
	
	@Override
	public void withdraw(double amount) {
		if((0 < amount) && (amount + withdrawalFee < getBalance())) {
			super.withdraw(amount);
			super.withdraw(withdrawalFee);
		}
	}
	
	
	

}
