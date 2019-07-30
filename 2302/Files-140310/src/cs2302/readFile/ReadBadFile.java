package cs2302.readFile;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ReadBadFile {

	public static void main(String[] args) throws FileNotFoundException {
		// create a file object for a file we wish to access
		// to get information from
		File infile = new File("hello.txt");
		// create a scanner to actually get that information true
		// the file 
		Scanner inscan = new Scanner(infile);
	}
}
