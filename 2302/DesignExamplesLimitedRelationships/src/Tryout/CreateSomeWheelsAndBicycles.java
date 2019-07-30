package Tryout;

import bicycles.Bicycle;
import bicycles.Wheel;

/**
 * Create some wheels and bicycles to illustrate how
 * we link all these together.
 * 
 * @author rbrook46
 *
 */

public class CreateSomeWheelsAndBicycles {
	
	public static void main(String[] args) {
		Bicycle bike = new Bicycle("graphite", 200, "white", 2000);
		Wheel w1 = new Wheel ("aluminum", 1000, 20, 500);
		Wheel w2 = new Wheel ("aluminum", 1000, 20, 500);
		// connect the Wheels to the bicycle
		bike.putWheel (0, w1);
		bike.putWheel (1, w2);
		// tell the Wheels about the bicycle
		w1.setInstallON(bike);
		w2.setInstallON(bike);
		
		
		// use the new all in one constructors to construct two more
		// wheels and another bicycle.
		// Wheel w21 = new Wheel ("iron", 3000, 40, 20, installedOn);
		// Bicycle bike2 = new Bicycle("carbon fiber", 200, "Black", 3000);
		
		Bicycle bike2 = new Bicycle("carbon fiber", 200, "black", 3000);
	}

}
