package cs2302.accounts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cs2302.accounts.InterestBearingAccount;

public class TestMinMonthlyBalance {

	private static final double EPS = 1e-15;
	
	@Test
	public void testStartAt0() {
		InterestBearingAccount iba = new InterestBearingAccount("acct-1003");
		assertEquals(0, iba.getMinMonthlyBalance(),EPS);
		iba.deposit(300);
		assertEquals(0, iba.getMinMonthlyBalance(),EPS);
		iba.withdraw(200);
		assertEquals(0, iba.getMinMonthlyBalance(),EPS);
	}
	
	@Test
	public void testStartAt500() {
		double minbal = 500;
		double mrate = 1;
		InterestBearingAccount iba = new InterestBearingAccount(null, null, 
				minbal, mrate*12);
		assertEquals(minbal, iba.getMinMonthlyBalance(),EPS);
		iba.deposit(200);  // bal = 700
		assertEquals(minbal, iba.getMinMonthlyBalance(),EPS);
		iba.withdraw(100);  // bal = 600
		assertEquals(minbal, iba.getMinMonthlyBalance(),EPS);
		iba.withdraw(200);  // bal = 400
		minbal = 400;
		assertEquals(minbal, iba.getMinMonthlyBalance(),EPS);
		iba.deposit(200);  // 600
		assertEquals(minbal, iba.getMinMonthlyBalance(),EPS);
		double inter = minbal * mrate;
		iba.addMonthlyInterest();
		assertEquals(600+inter, iba.getBalance(),EPS);
		
	}

}