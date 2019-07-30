/*Ronald Brooks
 * 9/13/13
 * Dr. North
 * Mod 2 #2
 * This program determines the price of a table. 
 */
import java.util.Scanner;
public class Furniture_Company {
	public static void main(String[] args) {
		//Format text to display choices
		System.out.printf ( "%s\n%s\n","Choose 1 for Pine","Choose 2 for Oak");
		System.out.printf ( "%s\n","Choose 3 for Mahogany");
		Scanner input = new Scanner (System.in);
		//User input
		System.out.print("Enter your choice: ");
		double choice = input.nextDouble();
		//if-else conditions to display correct text
		if (choice == 1) System.out.print("The price for Pine is $420");
		else if (choice == 2) System.out.print("The price for Oak is $225");
		else if (choice == 3) System.out.print("The price for Mahogany is $310");
		else System.out.print("Invalid Choice");
	}	
}
