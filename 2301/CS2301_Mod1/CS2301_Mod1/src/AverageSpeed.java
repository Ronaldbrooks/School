/* Ronald Brooks
 * 9/5/13
 * Dr. North
 * This program will display the average mph of a runner who runs 14 km in 45 minutes and 30 seconds
 * Mod 1 Ex-1.10 #6
 */

public class AverageSpeed {
	public static void main(String[] args) {
		double mile = 14/1.6;
		double persecond = 8.75/2730;
		double mph = persecond * 3600;
		System.out.println("The average mph of the runner is: " + mph + " mph");
	}

}
