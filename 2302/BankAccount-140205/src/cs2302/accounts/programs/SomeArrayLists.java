package cs2302.accounts.programs;
import java.util.ArrayList;

import cs2302.accounts.Person;

public class SomeArrayLists {

	public static void main(String[] args) {
		// Name the class: ArrayList
		// Put the type of objects to put in the arraylist
		//		Person in this case
		ArrayList<Person> people;
		// people is an array list of person objects
		// people is a reference with a value null right now
		people = new ArrayList<Person>();
		// we now have a list of person objects
		// it is empty
		System.out.println ("people has " + people.size() + " elements");
		Person alice = new Person("Alice", "cust-001", "alice@acme.com");
		Person bob = new Person("Bob", "cust-002", "bob@nadir.com");
		Person chloe = new Person("Chloe", "cust-003", "chloe@zenith.com");
		Person dan = new Person("Dan", "cust-004", "dan@acme.com");
		Person eve = new Person("Eve", "cust-005", "eve@nadir.com");
		Person frank = new Person("Frank", "cust-006", "frank@zenith.com");
		
		System.out.println ("people has " + people.size() + " elements");
		people.add(alice);
		System.out.println ("people has " + people.size() + " elements");
		people.add(bob);
		System.out.println ("people has " + people.size() + " elements");
		people.add(chloe);
		System.out.println ("people has " + people.size() + " elements");
		
		for(int i = 0; i < people.size(); i++) {
			Person p = people.get(i);
			System.out.println(i + " " + "Person name is " + p.getName() +
					" email address is " + p.getE_mail());
		}

		ArrayList<Integer>numbers; //just like an ArrayList with int values in it 
		ArrayList<String> bunchOfStrings;
		
		// Lesson in polymorphism
		ArrayList<Object> things = new ArrayList<Object>();
		things.add("Hello"); // added a String Object
		things.add(chloe);   // added a Person Object
		things.add(3); // Java converts 3 to an Integer and puts that in
					   // AutoBoxing
		// things is like a trash heap: you can put anything in it but you don't 
		// know what to expect when you get things out
		
		for(Person p : people) { // for-each loop (in honor Perl)
			System.out.println("Person name is " + p.getName());
		}
		
	}

}
