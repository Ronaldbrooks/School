package tryout;

import clubs.Club;
import clubs.Person;

/**
 * Create a few objects from the Club example
 * 
 * @author rbrook46
 *
 */

public class CreateClubObjects {
	
	public static void main(String[] args) {
		Person p;
		p = new Person();
		System.out.println("Person p name is " + p.getName());
		p.setName("George");
		System.out.println("Person p name is " + p.getName());
		
		Club c;
		c = new Club("Rugby", "Intercollegiate competition");
		System.out.println("Club c name is " + c.getName());
	}

}

