package cs2302.employee;

public class Staff extends Employee{


	public Staff(String name, String email, double salary, String title) {
		super(name, email, salary);
		this.title = title;
		
	}
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Staff:" + getName();
	}
}
