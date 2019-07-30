/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import carModels.Car;
import carModels.Interior;
import carModels.Radio;

/**
 * 
 * As the name says, this is just to make sure that constructors and
 * attribute getters and setters are all in palce.
 * 
 * @author Ben Setzer
 *
 */
public class TestBasicMethodsAndConstructor {


	@Test
	public void testCarConstructor() {
		String model = "Windstar";
		int price = 2000;
		Car c = new Car(model, price);
		assertEquals(model, c.getModel());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void testInteriorConstructor() {
		String material = "Leather";
		int price = 500;
		Interior intr = new Interior(material, price);
		assertEquals(material, intr.getMaterial());
		assertEquals(price, intr.getPrice());
	}
	
	@Test
	public void testRadioConstructor() {
		String description = "Acme mono AM";
		int price = 5;
		Radio r = new Radio(description, price);
		assertEquals(description, r.getDescription());
		assertEquals(price, r.getPrice());
	}
	
	@Test
	public void testCarSetters() {
		Car c = new Car(null,0);
		String model = "Windstar";
		int price = 2000;
		c.setModel(model);
		c.setPrice(price);
		assertEquals(model, c.getModel());
		assertEquals(price, c.getPrice());
	}
	
	@Test
	public void testInteriorSetters() {
		Interior intr = new Interior(null,0);
		String material = "Leather";
		int price = 500;
		intr.setMaterial(material);
		intr.setPrice(price);
		assertEquals(material, intr.getMaterial());
		assertEquals(price, intr.getPrice());
	}
	
	@Test
	public void testRadioSetters() {
		Radio r = new Radio(null,0);
		String description = "Acme mono AM";
		int price = 5;
		r.setDescription(description);
		r.setPrice(price);
		assertEquals(description, r.getDescription());
		assertEquals(price, r.getPrice());
	}

}
