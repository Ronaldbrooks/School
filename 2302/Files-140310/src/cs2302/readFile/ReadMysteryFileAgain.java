package cs2302.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadMysteryFileAgain {
	
	/**
	 *  Count how many lines mention Sherlock
	 * @param args
	 * @throws FileNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		File infile = new File ("mystery/TheAdventureOfWisteriaLodge.txt");
		Scanner inscan = new Scanner(infile);
		// why don't we just write:???
		// inscan = new Scanner ("mystery/TheAdventureOfWisteriaLodge.txt");
		// this would just give us the data in the NAME of the file not the file 
		
		int count = 0;
		while(inscan.hasNextLine()) {
			String line = inscan.nextLine();
			//does this line have 'Sherlock' on it?
			String key = "Sherlock";
			int index = line.indexOf("Sherlock");
			// index is >= if the string was found (index where it starts)
			// < 0  if the string was not found
			if (index >= 0) {
				System.out.println (key + " Mentioned on |" + line + "|");
				
				count++;
			}
		}
		System.out.println(key + " appeared on " + count + "");
		inscan.close();
	}

}
