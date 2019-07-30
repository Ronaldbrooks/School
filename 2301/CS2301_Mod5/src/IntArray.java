/* Ronald Brooks
 * 10/25/13
 * CS2301
 * Dr. North
 */

public class IntArray {
	public static void main(String[] args) {
		
		//Declare the array
		int[] intArray = {12, 24, 37, 83, 69};
		
		//display array values first to last
		for(int i = 0; i < intArray.length ;  i++) {
			System.out.print (intArray[i] + " ");
			System.out.print(" ");
	}			
		//display array values last to first
		System.out.println();
		for(int q = intArray.length - 1; q >= 0; q--) {
			System.out.print (intArray[q] + " "); 
			System.out.print (" ");
		
	}
}
}