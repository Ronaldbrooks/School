package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import carModels.Car;
import carModels.Interior;
import carModels.Radio;

public class TestRelationshipMethods {

	
	private String model = "Windstar";
	private int carPrice = 2000;
	private Car c;
	
	private String material = "Leather";
	private int interiorPrice = 500;
	private Interior intr;
	
	private String description = "Acme mono AM";
	private int radioPrice = 5;
	private Radio rad;
	
	private int totalPrice = carPrice + interiorPrice + radioPrice;
	
	@Before
	public void setUp() throws Exception {
		c = new Car(model,carPrice);
		intr = new Interior(material, interiorPrice);
		rad = new Radio(description, radioPrice);
		c.setTheInterior(intr);
		c.setTheRadio(rad);
		intr.setInstalledIn(c);
		rad.setInstalledIn(c);		
	}

	@Test
	public void testCarInInterior() {
		assertEquals(c, intr.getInstalledIn());
	}
	
	@Test
	public void testCarInRadio() {
		assertEquals(c, rad.getInstalledIn());
	}
	
	@Test
	public void testRadioInCar() {
		assertEquals(rad, c.getTheRadio());
	}
	
	@Test
	public void testInteriorInCar() {
		assertEquals(intr, c.getTheInterior());
	}

	@Test
	public void testTotalPrice() {
		assertEquals(totalPrice, c.getTotalPrice());
	}
	
}
