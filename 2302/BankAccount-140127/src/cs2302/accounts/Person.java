package cs2302.accounts;

public class Person {

	private String name;
	private String personId;
	private String e_mail;
	
	/**
	 * Initialize the properties of this object to the given parameter values.
	 * If a value is not known, use null.
	 */
	public Person(String name, String personId, String e_mail) {
		super();
		this.name = name;
		this.personId = personId;
		this.e_mail = e_mail;
	}
	
	public Person(String personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getPersonId() {
		return personId;
	}
	
	
	
}
