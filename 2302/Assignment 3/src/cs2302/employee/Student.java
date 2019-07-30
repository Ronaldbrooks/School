package cs2302.employee;

public class Student extends Person{

	public Student(String name, String email, String classStatus) {
		super(name, email);
		this.classStatus = classStatus;
	}

	private String classStatus;

	public String getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(String classStatus) {
		this.classStatus = classStatus;
	}

	@Override
	public String toString() {
		return "Student:" + getName();
	}
}
