/* Ronald Brooks
 * 11/1/13
 * Dr. North
 * Mod 6 #2
 */

import java.util.Scanner;
public class Account {
	
	public static void main(String[] args) {
		int id =0;
		int day =0;
		int month =0;
		int year =0;
		double balance = 20000;
		double annualInterestRate = 0.045;
		int monthlyInterestRate = 0;
		
		identity(id);
		dateCreated (day,month,year,id);
		withdraw(balance);
		deposit(balance);
		getMonthlyInterestRate(balance, monthlyInterestRate);
		getMonthlyInterest(balance, annualInterestRate);
	}
	
	private static void identity(int id) {
	// TODO Auto-generated method stub
		Scanner stdInt = new Scanner (System.in);
		System.out.println("Enter your id number: ");
		id = stdInt.nextInt();
		System.out.println ("Account number: " + id);
		System.out.println(" ");
	}

	//withdraw method and operations
	public static void withdraw(double balance) {
		// TODO Auto-generated method stub
		int w = 0;
		Scanner stdInt = new Scanner (System.in);
		System.out.println("Enter the amount you wish to withdraw: ");
		w = stdInt.nextInt();
		balance -= w;
		System.out.println("Your balance is: " + balance);
		System.out.println(" ");
		
	}
	
	//Deposit method and operations
	public static void deposit(double balance) {
		// TODO Auto-generated method stub
		int d = 0;
		Scanner stdInt = new Scanner (System.in);
		System.out.println("Enter the amount you wish to deposit:");
		d = stdInt.nextInt();
		balance += d;
		System.out.println("Your balance is: " + balance);
		System.out.println(" ");
	}

	//method for monthly interest rate
	public static void getMonthlyInterestRate(double balance, int annualInterestRate ) {
		// TODO Auto-generated method stub
		int mir =0;
		mir = annualInterestRate / 12;
		System.out.println("Your monthly interest rate is: " + mir);
		System.out.println(" ");
	}
	
	//Method for monthly interest
	public static void getMonthlyInterest(double balance, double annualInterestRate) {
		// TODO Auto-generated method stub
		double mi=0;
		mi = (double) (balance * annualInterestRate);
		System.out.println("Your monthly interest is: " + mi);
		System.out.println(" ");
	}
	
	//private date method
	private static void dateCreated (int day,int month, int year, double id) {
		Scanner stdInt = new Scanner (System.in);
		System.out.println("Enter the day: ");
		day = stdInt.nextInt();
		System.out.println("Enter the month: ");
		month = stdInt.nextInt();
		System.out.println("Enter the year: ");
		year = stdInt.nextInt();
		
		System.out.println("Created: " + month + "/" + day + "/" + year);
		System.out.println(" ");
	}
	}





