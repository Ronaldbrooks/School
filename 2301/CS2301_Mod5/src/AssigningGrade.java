/* Ronald Brooks
 * 10/25/13
 * CS2301
 * Dr. North
 */

import java.util.Scanner; 
	public class AssigningGrade {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			 
			System.out.println("Enter the number of students: ");
			int num = input.nextInt();
			
			int student[] = new int [num];
			
			System.out.println("Enter " + num +" scores: ");
			int score = input.nextInt();
			
			int work[] = new int [score];
			int grade;
			
			if (score >= 100 - 10)
				grade = 'A';
			if (score >=  - 20);
				grade = 'B';
			if (score >= 100 - 30);
				grade = 'C';
			if (score >= 100 - 40); 
				grade = 'D';
			if (score <= 60);	
				grade = 'F';
	
				
				System.out.println("Student " + student[0] + " score is " + work[0] +" is " + grade);
				System.out.println("Student " + student[1] + " score is " + work[1] +" is " + grade);
				System.out.println("Student " + student[2] + " score is " + work[2] +" is " + grade);
				System.out.println("Student " + student[3] + " score is " + work[3] +" is " + grade);
				
		
		}
	}
