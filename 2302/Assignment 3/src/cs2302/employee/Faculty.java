package cs2302.employee;

public class Faculty extends Employee{


	public Faculty(String name, String email, double salary, String officeHours) {
		super(name, email, salary);
		this.officeHours = officeHours;
		
	}

	private String officeHours;

	public String getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(String officehours) {
		this.officeHours = officehours;
	}

	@Override
	public String toString() {
		return "Faculty:" + getName();
	}
}
