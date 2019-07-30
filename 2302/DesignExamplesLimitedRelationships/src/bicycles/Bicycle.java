package bicycles;

/**
 * Bicycle and Wheel are used to demonstrate simple relationships between
 * 	classes and objects.
 * 
 * @author Ben Setzer
 *
 */
public class Bicycle {
	private String material;
	private int sizeInCentimeters;
	private String color;
	private int priceInDollars;
	
	private Wheel[] myWheels;


	public Bicycle(String material, int sizeInCentimeters, String color,
			int priceInDollars) {
		super();
		this.material = material;
		this.sizeInCentimeters = sizeInCentimeters;
		this.color = color;
		this.priceInDollars = priceInDollars;
		myWheels = new Wheel[2];
		// The value of myWheels[0] at this point is null
		// myWheels is a reference to an array of 2 elements
		
	}
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public int getSizeInCentimeters() {
		return sizeInCentimeters;
	}
	public void setSizeInCentimeters(int sizeInCentimeters) {
		this.sizeInCentimeters = sizeInCentimeters;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPriceInDollars() {
		return priceInDollars;
	}
	public void setPriceInDollars(int priceInDollars) {
		this.priceInDollars = priceInDollars;
	}
	/**
	 *  Get the wheel at index 1.
	 *  
	 *  @param i  should be 0 or 1
	 *  @return The wheel at index 1 attached to this bicycle
	 */
	public Wheel getWheel(int i) {
		return myWheels[i];
	}
	 /**
	  * Install wheel w at index i in this bicycle
	  * 
	  * @param i   should be 0 or 1
	  * @param w
	  */
	public void putWheel(int i, Wheel w) {
		myWheels[i] = w;
	}
	public int getNumberOfWheels() {
		return myWheels.length;
	}
}
