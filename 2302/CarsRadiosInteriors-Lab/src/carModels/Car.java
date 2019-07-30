/**
 * 
 */
package carModels;

/**
 * 
 * This class represents cars that a prospective buyer can order.
 * 
 * @author Ben Setzer
 *
 */
public class Car {
	
	private String model;
	private int price;
	private Interior theInterior;
	private Radio theRadio;
	private int TotalPrice;
	
	
	public Car(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Interior getTheInterior() {
		return theInterior;
	}


	public void setTheInterior(Interior theInterior) {
		this.theInterior = theInterior;
	}


	public Radio getTheRadio() {
		return theRadio;
	}


	public void setTheRadio(Radio theRadio) {
		this.theRadio = theRadio;
	}

	public int getTotalPrice() {
		return price + theRadio.getPrice()+ theInterior.getPrice();
		
	}


	public void setTotalPrice(int totalPrice) {
		TotalPrice = totalPrice;
	}
}