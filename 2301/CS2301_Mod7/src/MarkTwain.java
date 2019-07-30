/* Ronald Brooks
 * 11/15/13
 * Dr. North
 * Mod 7 #2 
 */

public class MarkTwain {
	public static void main(String[] args) {
	String quote = ("It is better to deserve honours and not have them than to have them and not deserve them.");

		System.out.println("indexOf('h')" + quote.indexOf('h')); 
		System.out.println("charAt(14)" + quote.charAt(14));
		System.out.println("endsWith('Twain')" + quote.endsWith("Twain")); 
		System.out.println("replace('a','A')" + quote.replace('a','A')); 
		System.out.println("indexOf('O')" + quote.indexOf('O'));
		System.out.println("replace('t', 'T')" + quote.replace('t','T'));
		System.out.println("replace('d','p')" + quote.replace('d','p'));
		System.out.println("replace('n','a')" + quote.replace('n','a'));
}
}


