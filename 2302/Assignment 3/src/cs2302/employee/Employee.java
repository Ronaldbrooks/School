package cs2302.employee;

public class Employee extends Person{

	public Employee(String name, String email, double salary) {
		super(name, email);
		this.salary = salary;
	}
	
		private double salary;
		private Employee Date;
		
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Employee getDate() {
			return Date;
		}
		
		@Override
		public String toString() {
			return "Employee:" + getName();
		}	
	}


