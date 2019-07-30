package cs2302.pictures.programs;

import cs2302.pictures_v2.Circle;
import cs2302.pictures_v2.PicPoint;
import cs2302.pictures_v2.Picture;



/**
 * The purpose of this program is to illustrate
 * creating objects of different classes.
 * 
 * @author Ben Setzer
 *
 */
public class AbstractVsConcrete {

	
	public static void main(String[] args) {
		PicPoint pnt1 = new PicPoint(2.0f, 3.0f);
		Picture pic1 = new Picture(pnt1);
		Picture pic2 = new Picture(new PicPoint(2.5f, 3.2f));
		System.out.println("pic1 base is " + pic1.getBase());
		// chaining object.method().method().method()....
		// or   object.object.method()
		System.out.println("pic1 base x is " + pic1.getBase().getX());
		
		PicPoint pic1Base = pic1.getBase();
		float pic1BaseX = pic1Base.getX();
		System.out.println("pic1 base x is " + pic1BaseX);
		
		//PicPoint pnt2 = new PicPoint(3.5f, 4.1f);
		//Geometric g1 = new Geometric(pnt2);
		
		PicPoint pnt3 = new PicPoint(3.5f, -4.1f);
		Circle c1  = new Circle(pnt3, 2.0f);
		// How do all the constructors work together??
		// Circle constructor gets 'base' and 'radius'
		//						    pnt3        2.0f
		// Circle constructor passes 'base' on to the super class
		//                   uses 'radius' to initialize the instance field
		// Geometric constructor accepts the 'base' from Circle
		//			and then just passes it along to the super class
		// Picture constructor accepts the 'base' from Geometric
		//		and then initializes the instance field
		// 		and then invokes the default constructor of Object
		
		
		System.out.println("c1 center y is " + c1.getBase().getY());
		
	}

}





