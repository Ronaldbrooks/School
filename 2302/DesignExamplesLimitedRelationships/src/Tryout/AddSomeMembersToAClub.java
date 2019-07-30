package Tryout;
import clubs.Club;
import clubs.Person;


	/**
	 * Creat a club and add some members to it.
	 * 
	 * @author Ben Setzer
	 * 
	 */
public class AddSomeMembersToAClub {
	
	public static void main(String[] args) {
		Club c = new Club("Bingo", "Guess what?");
		Person p = new Person();
		p.setName("Alice");
		Person p2 = new Person();
		p2.setName("Bob");
		c.addMember(p);
		c.addMember(p2);
		System.out.println("There are now" + c.getCurrentNumberOfMembers() + " Members in c");
		System.out.println("One Member is " + c.getMember(0) + c.getName());
		for(int i = 0; i < c.getCurrentNumbeOfMembers(); i++) {
			System.out.println("Member is " + c.getMember(i).getName());
		}
	}
}
