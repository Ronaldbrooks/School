/* Ronald Brooks
 * 11/15/13
 * Dr. North
 * Mod 7 #1
 */

public class CompareStringValues {
	public static void main (String[] args) {
		String aString = "Hello world";
		String bString = "What's up world ";
		String cString = "Hey world";
		String dString = "Yo world";
		int x, y, z;
		
		x = aString.compareTo(bString);
		System.out.println(aString + ".compareTo(" + bString + ") produces " + x);
		y = bString.compareTo(cString);
		System.out.println(bString + ".compareTo(" + cString + ") produces " + y);
		z = cString.compareTo(dString);
		System.out.println(cString + ".compareTo(" + dString + ") produces " + z);
		
	}
}
