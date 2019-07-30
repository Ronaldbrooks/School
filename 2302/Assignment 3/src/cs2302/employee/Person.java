package cs2302.employee;

public class Person {
	
	private String name;
	private String email;
	
	public Person(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailAddress() {
		return email;
	}
	public void setEmailAddress(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Person:" + name;
	}
	
	
}
