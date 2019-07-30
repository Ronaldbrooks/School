package cs2302.readFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadBadFileAgain {
	
	public static void main(String[] args) {
		File infile = new File("hello.txt");
		try { // try block
			Scanner inscan = new Scanner(infile);
			System.out.println("Now go on and do something with the file content");
		} catch (FileNotFoundException e) { // catch clause
			// e is the exception object
			// e.printStackTrace();
			System.out.println("Something really really really bad happened");
			System.out.println("Oh the horror");
		}
		System.out.println("Everything is for the best in the best of all possible worlds");
	}
}
