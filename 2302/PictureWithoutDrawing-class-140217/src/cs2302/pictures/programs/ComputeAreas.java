package cs2302.pictures.programs;

import java.util.ArrayList;
import java.util.List;

import cs2302.pictures_v2.Circle;
import cs2302.pictures_v2.Geometric;
import cs2302.pictures_v2.PicPoint;
import cs2302.pictures_v2.Rectangle;



/**
 * 
 * Create several geometric objects (circle, rectangle,
 * triangle) and put them in an ArrayList and then
 * go through the list and add up the areas. 
 * 
 * @author Ben Setzer
 *
 */
public class ComputeAreas {

	/**
	 * Compute the total area of figures in
	 * a list of 'geometric' objects.
	 * @param args
	 */
	public static void main(String[] args) {
		List<Geometric> geomList;
		geomList = new ArrayList<Geometric>();
		
		Rectangle r1  = new Rectangle(new PicPoint(2, 3), 5, 8);
		PicPoint pnt1 = new PicPoint(154,55);
		Circle c1 = new Circle(pnt1, 1);
		
		geomList.add(r1);
		geomList.add(c1);
		
		float totalArea = 0.0f;
		for(int i = 0; i < geomList.size(); i++ ) {
			Geometric g = geomList.get(i);
			totalArea = totalArea + g.getArea();
		}
		System.out.println("The total area is " + totalArea);
	}

}


