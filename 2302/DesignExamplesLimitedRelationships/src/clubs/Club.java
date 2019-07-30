package clubs;

public class Club {

	private String name;
	private String description;
	
	private Person[] members;
	private final int MAX_NUMBERS_OF_MEMBERS = 100;
	private int currentNummerOfMembers;
	
	

	public Club(String name, String description) {
		super();
		this.name = name;
		this.description = description;
		
		members = new Person[MAX_NUMBER_OF_MEMBERS];
		currentNumberOfMembers = 0;
		
		/**
		 * Get the member at index 1.
		 * 
		 * @param i should be between 0 and...
		 * @return
		 */
		public Person getMember(int i) {
			return members[i];
		}
		Public void addMember (Person newMember)
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
		
	}	
}
	