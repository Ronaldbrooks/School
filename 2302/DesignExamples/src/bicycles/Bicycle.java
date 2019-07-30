package bicycles;

/**
 * Created getters, setters and constructors
 * 
 * @author rbrook46
 *
 */

public class Bicycle {
	private String material;
	private int sizeInCentimeters;
	private String color;
	private int priceInDollars;
	
	public Bicycle(String material, int sizeInCentimeters, String color,
			int priceInDollars) {
		super();
		this.material = material;
		this.sizeInCentimeters = sizeInCentimeters;
		this.color = color;
		this.priceInDollars = priceInDollars;
	
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
}
