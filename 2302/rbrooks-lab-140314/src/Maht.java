/**
 * Mathematical functions done the hard way.
 *
 *  While these functions are not practical they are of great theoretical interest
 *  since they demonstrate how to compute standard arithmetic functions
 *  only using adding and subtracting 1 and comparing values for equality.
 *
 *
 * @author Ben Setzer
 *
 */
public class Maht {
	
	/**
	 * Returns a value computed from m and n.
	 * 
	 * @param n Should not be negative
	 * @param m No limitations
	 * @return  Guess!
	 */
	public static  int recur1(int n, int m) {
		if(n == 0) {
			return m;
		} else if (n < 0) {
			throw new IllegalArgumentException("bad value of n:" + n + m);
		} else {
			return recur1(n-1,m)+1;
		}
	}
	/**
	 * Returns a value computed from m and n.
	 * 
	 * @param n  Should not be negative
	 * @param m  Should not be negative
	 * @return Guess!
	 */
	public static int recur2(int n, int m) {
		if(n == 0) {
			return 0;
		} else if (n < 0) {
			throw new IllegalArgumentException("Neither parameter to recur2 should be negative:" + n + m);
		} else {
			return recur1(m, recur2(n-1,m));
		}
	}
	
	/**
	 * Returns a value computed from m and n.
	 *  
	 * @param n Should be greater than or equal to m
	 * @param m Should be less than or equal to n
	 * @return Guess!
	 */
	public static int recur3(int n, int m) {
		if(n == m) {
			return 0;
		} else if (m >= n) {
			throw new IllegalArgumentException("Neither parameter to recur2 should be negative:" + n + m);
		} else {
			return recur1(1,recur3(n-1,m));
		}
	}

}