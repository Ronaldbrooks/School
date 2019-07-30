package cs2302.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Examine the mystery short story
 * 
 * @author rbrook46
 *
 */

public class ReadMysteryFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		File infile = new File("mystery/TheAdventureOfWisteriaLodge.txt");
		Scanner inscan = new Scanner(infile); // open a scanner
		// provides access to the data in the file
		String line = inscan.nextLine(); // get the next line of data
		// this actually gets the FIRST line of data in the file
		System.out.println("The first line is |" + line + "|");
		line = inscan.nextLine();
		System.out.println("The second line |" + line + "|");
		
		while(inscan.hasNextLine()) {
			line = inscan.nextLine();
			System.out.println("Yet another: |" + line + "|");
		}
		
		inscan.close(); // Let's the OS release reserve resources
		
	}

}
