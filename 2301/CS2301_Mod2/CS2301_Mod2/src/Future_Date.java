/*Ronald Brooks
 * 9/13/13
 * Dr. North
 * Mod 2 #2
 * This program will provide future dates
 */
import java.util.Scanner;
public class Future_Date {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Year: ");
		double year = input.nextDouble();
		System.out.print("Enter Month: ");
		double month = input.nextDouble();
		System.out.print("Enter the day of the month: ");
		double day = input.nextDouble();
		
		double j = year/100;
		double k = year % 100;
		double h = (day + (26 *(month + 1)/10) + k + ((k/4) + j/4)) + (5 * j) % 7;
		if (h == 0) System.out.print("The day of the week is saturday");
		else if (h == 1) System.out.print("The day of the week is sunday");
		else if (h == 2) System.out.print("The day of the week is monday");
		else if (h == 3) System.out.print("The day of the week is tuesday");
		else if (h == 4) System.out.print("The day of the week is wensday");
		else if (h == 5) System.out.print("The day of the week is thursday");
		else if (h == 6) System.out.print("The day of the week is friday");
		else System.out.print("invalid");
	}
}
