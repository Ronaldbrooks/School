package chapter11.employee;


public class Employee extends Person {
	public Employee() {
		this("(2) Invoke Employee overloaded constructor");
		System.out.println("(3) default Employee constructor continues");
	}
	
	public Employee(String s) {
		System.out.println(s + "---- by second constructor");
	}
}



