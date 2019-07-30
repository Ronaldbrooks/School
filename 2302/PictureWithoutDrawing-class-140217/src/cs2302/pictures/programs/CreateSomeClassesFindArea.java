package cs2302.pictures.programs;

import java.util.ArrayList;

import cs2302.pictures.Circle;
import cs2302.pictures.Geometric;
import cs2302.pictures.PicPoint;
import cs2302.pictures.Rectangle;


/**
 * Create some geometric objects and find their areas.
 * 
 * @author rbrook46
 *
 */
public class CreateSomeClassesFindArea {

	public static void main(String[] args) {
	
	PicPoint pg1 = new PicPoint(2,3);
	//Geometric g1 = new Geometric(pg1);
	PicPoint pc1 = new PicPoint(4,5);
	//Circle c1 = new Circle(pc1,1);
	PicPoint pr1 = new PicPoint(6,7);
	//Rectangle r1 = new Rectangle(pr1,2,6);
	//System.out.println("The Area of g1 is " + g1.getArea());
	//System.out.println("The Area of c1 is " + c1.getArea());
	//System.out.println("The Area of r1 is " + r1.getArea());
	System.out.println("==================================");
	//printArea(g1);
	//printArea(c1);
	//printArea(r1);
	
	ArrayList<Geometric> figures = new ArrayList<Geometric>();
	//figures.add(g1);
	//figures.add(c1);
	//figures.add(r1);
	System.out.println("===================================");
	for(Geometric g: figures) {
		System.out.println("the Area of the geometric in the list is " + g.getArea());
	}
	System.out.println("===================================");
	for(int i = 0; i < figures.size(); i++) {
		Geometric g = figures.get(i);
		System.out.println("the Area of the geometric in the list is " + g.getArea());
	}
	}
	/**
	 * Method to print out the area of a geometric 
	 */
	public static void printArea(Geometric g) {
		System.out.println("The Area is " + g.getArea());
	}
}
