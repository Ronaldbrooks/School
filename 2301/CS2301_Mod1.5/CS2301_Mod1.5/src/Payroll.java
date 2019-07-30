/* Ronald Brooks
 * 9/5/13
 * Dr. North
 * This program will calculate payroll
 * Mod 2 #2
 */

import java.util.Scanner;
	public class Payroll {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
			//User input of variables
			System.out.print("Enter hourly rate of pay: ");
			double pay = input.nextDouble();
			System.out.print("Enter number of hours worked: ");
			double hours = input.nextDouble();
			//Calculation of variables
			double gross_pay  = (pay * hours);
			double withholding = ( gross_pay * 0.15);
			double net_pay = (gross_pay - withholding);
			//Display outcomes
			System.out.println("Gross pay: " + gross_pay);
			System.out.println("Withholding tax of gross pay: " + withholding);
			System.out.println("Net pay: " + net_pay);
	}
} //end of class
