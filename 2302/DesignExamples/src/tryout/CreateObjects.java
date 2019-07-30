package tryout;

import bicycles.Bicycle;
import bicycles.Wheel;

/**
 * Created objects for bicycle and wheel
 * 
 * @author rbrook46
 *
 */

public class CreateObjects {
	
	public static void main (String[] args) {
		
		Bicycle b;
		b = new Bicycle("Blue", 10, "Aluminum", 45);
		System.out.println("The Bicycle is " + b.getColor() + " and " + b.getMaterial() + " and the size in cm is " + b.getSizeInCentimeters() + 
		" and the price is " + b.getPriceInDollars());
		
		Wheel w;
		w = new Wheel("Aluminum", 15, 5, 7);
		System.out.println("The Wheel is " + b.getMaterial() + " and it weighs " + 
		w.getWeightInGrams() + " and it rim depth is " + w.getRimDepthInMilimeters() +
		" and price is " + w.getPriceInDollars());
		
	}

}
