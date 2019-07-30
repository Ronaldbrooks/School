/* Ronald Brooks
 * 9/5/13
 * Dr. North
 * This program will calculate the energy needed to heat water from 
 * an initial temperature to a final temperature
 * Mod 2 #3
 */

import java.util.Scanner;
	public class Energy {
		public static void main(String [] args) {
			Scanner input = new Scanner(System.in);
			//Collect user input
			System.out.print("Enter the amount of water in kilograms: ");
			double m = input.nextDouble();
			System.out.print("Enter the initial temperature: ");
			double initial_temp = input.nextDouble();
			System.out.print("Enter the final temperature: ");
			double final_temp = input.nextDouble();
			//Calculate input
			double energy = m * (final_temp - initial_temp) * 4184;
			System.out.println("The energy needed: " + energy);
		}
} //end of class
