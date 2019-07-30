package chapter11.overridingOverloading;

public class TestOverriding {

	
	public static void main(String[] args) {
		A a = new A();
		a.p(10);
		a.p(10.0);
	}
	
	
	// we put the definitions of A and B inside the main class
	//		so that they are not directly visible outside
	//	In this way they do not conflict with TestOverriding
	
	private static class B {
		public void p(double i) {
			System.out.println(i*2);
		}
	}
	
	private static class A extends B {
		// this method overrides the method in B
		public void p(double i) {
			System.out.println(i);
		}
	}
	

}
