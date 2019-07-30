package chapter11.geometry.programs;

import chapter11.geometry.Circle;

public class TryOutCircle {
	
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("The radius of c1 is " + c1.getRadius());
		System.out.println("The area of c1 is " + c1.getArea());
		System.out.println("The color of c1 is " + c1.getColor());
		System.out.println("The filled attribute of c1 is " + c1.isFilled());
		System.out.println("c1 was created at " + c1.getDateCreated());
		c1.setColor("Aqua");
		System.out.println("The color of c1 is " + c1.getColor());
	}

}
