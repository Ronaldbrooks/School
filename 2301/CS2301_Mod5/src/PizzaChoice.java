/* Ronald Brooks
 * 10/25/13
 * CS2301
 * Dr. North
 */

import java.util.Scanner; 

public class PizzaChoice {

	public static void main (String[] args) {
		//REVISIT STRINGS PG 235
		Scanner stdIn = new Scanner(System.in); 
	
		System.out.println("Select Pizza Size");
		System.out.println("1) Small");
		System.out.println("2) Medium");
		System.out.println("3) Large");
		System.out.println("4) Extra Large");
		System.out.println("------------------");
		System.out.println("");
		int c= stdIn.nextInt();
		
		System.out.println();
		
		if (c == 1){
		System.out.print("Your pizza will cost $6.99"); }
		else if (c == 2){
		System.out.print("Your pizza will cost $8.99"); }
		else if (c == 3){
		System.out.print("Your pizza will cost $12.99"); }
		else if (c == 4){
		System.out.print("Your pizza will cost $14.99");
		} else {
		System.out.print("Please make another selection");
			
				}
			}
	{
	}
}



		
