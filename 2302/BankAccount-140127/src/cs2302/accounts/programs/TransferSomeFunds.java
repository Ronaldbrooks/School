package cs2302.accounts.programs;

import cs2302.accounts.Account;
import cs2302.accounts.FeeForTransactionAccount;

public class TransferSomeFunds {

	public static void main(String[] args) {
		FeeForTransactionAccount ffta = new FeeForTransactionAccount ("acct-101");
		ffta.setDepositFee(20);
		ffta.setWithdrawalFee(50);
		System.out.println("ffta has balance: " + ffta.getBalance());
		Account acct = new Account ("acct-102");
		acct.deposit(400);
		System.out.println("acct has balance: " + acct.getBalance());
		ffta.transfer(toAcct, amount);
		
		

	}

}
