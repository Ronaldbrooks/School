/*Ronald Brooks
 * 9/13/13
 * Dr. North
 * Mod 2 #1
 * This program will prompts the user to enter two numbers, 
 * assigns each of them to a variable, then calculates, prints 
 * their sum, product, difference, quotient, and average.
 */

import java.util.Scanner;
	public class Arithmetic_Operation {
		public static void main(String[] args) {
			System.out.printf ( "%s\n%s\n", "Welcome to", "Java Programming!");
			//Get user input for the program
			Scanner input = new Scanner (System.in);
			System.out.print ("Enter your first number: ");
			double number1 = input.nextDouble();
			System.out.print ("Enter your second number: ");
			double number2 = input.nextDouble();
			//Calculate the displayed results
			double sum = (number1 + number2);
			double average = (number1 + number2) /2; 
			double product = (number1 * number2);
			double quotient = (number1 / number2);
			double difference = (number1 - number2);
			//Display results
			System.out.println("Your sum will be: " + sum);
			System.out.println("Your average will be: " + average);
			System.out.println("Your product will be: " + product);
			System.out.println("Your quotient will be: " + quotient);
			System.out.println("Your difference will be: " + difference);
		}
} //end of class
