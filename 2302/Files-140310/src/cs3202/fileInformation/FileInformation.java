package cs3202.fileInformation;
import java.io.File;
import java.sql.Date;
/**
 * Use the class file to get information about files.
 * 
 * @author rbrook46
 *
 */
public class FileInformation {
	
		public static void main(String[] ars) {
			
			File fl = new File("6of12.txt"); // relative path
			System.out.println("File f1 exist? " + fl.exists());
			System.out.println("fl absolute path: " + fl.getAbsolutePath());
			System.out.println("fl name: " + fl.getName());
			System.out.println("fl parent: " + fl.getName());
			System.out.println("fl is directory? " +fl.isDirectory());
			System.out.println("fl is file? " + fl.isFile());
			System.out.println("fl " + fl.length());
			System.out.println("fl last modified: " + fl.lastModified());
			System.out.println("====================================");
			
			File f2 = new File("hello.txt");
			System.out.println("File f2 exist? " + f2.exists());
			System.out.println("f2 absolute path: " + f2.getAbsolutePath());
			System.out.println("f2 name: " + f2.getName());
			System.out.println("f2 parent: " + f2.getName());
			System.out.println("f2 is directory? " + f2.isDirectory());
			System.out.println("f2 is file? " + f2.isFile());
			System.out.println("f2 " + f2.length());
			System.out.println("f2 last modified: " + f2.lastModified());
			System.out.println("====================================");
			
			File f3 = new File("mystery");
			System.out.println("File f3 exist? " + f3.exists());
			System.out.println("f3 absolute path: " + f3.getAbsolutePath());
			System.out.println("f3 name: " + f3.getName());
			System.out.println("f3 parent: " + f3.getName());
			System.out.println("f3 is directory? " + f3.isDirectory());
			System.out.println("f3 is file? " + f3.isFile());
			System.out.println("f3 " + f3.length());
			System.out.println("f3 last modified: " + f3.lastModified());
			Date d3 = new Date(f3.lastModified());
			System.out.print("f3 last modified, as a Date: " + d3);
			System.out.println("====================================");
			
			File f4 = new File("mystery/TheAdventureOfWisteriaLodge.txt");
			System.out.println("File f4 exist? " + f4.exists());
			System.out.println("f4 absolute path: " + f4.getAbsolutePath());
			System.out.println("f4 name: " + f4.getName());
			System.out.println("f4 parent: " + f4.getName());
			System.out.println("f4 is directory? " + f4.isDirectory());
			System.out.println("f4 is file? " + f4.isFile());
			System.out.println("f4 " + f4.length());
			System.out.println("f4 last modified: " + f4.lastModified());
			Date d4 = new Date(f4.lastModified());
			System.out.print("f4 last modified, as a Date: " + d4);
			System.out.println("====================================");
			
			File f5 = new File("src/cs3202/fileInformation/FileInformation.java");
			System.out.println("File f5 exist? " + f5.exists());
			System.out.println("f5 absolute path: " + f5.getAbsolutePath());
			System.out.println("f5 name: " + f5.getName());
			System.out.println("f5 parent: " + f5.getName());
			System.out.println("f5 is directory? " + f5.isDirectory());
			System.out.println("f5 is file? " + f5.isFile());
			System.out.println("f5 " + f5.length());
			System.out.println("f5 last modified: " + f5.lastModified());
			Date d5 = new Date(f5.lastModified());
			System.out.print("f5 last modified, as a Date: " + d5);
			System.out.println("====================================");
			
		}
}
