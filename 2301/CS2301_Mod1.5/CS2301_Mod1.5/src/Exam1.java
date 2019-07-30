/* Ronald Brooks
 * 9/5/13
 * Dr. North
 * This program will calculate the average of three scores
 * Mod 2 #1
 */

import java.util.Scanner;
	public class Exam1 {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
			//Collect user input
			System.out.print("Enter three numbers: ");
			double number1 = input.nextDouble();
			double number2 = input.nextDouble();
			double number3 = input.nextDouble();
			//Calculation of user input
			double average = (number1 + number2 + number3) / 3;
			//Displaying the average
			System.out.println("The average of " + number1 + ", " + number2 + ", " + number3 + ", is " + average);
		}
	}//end of class
