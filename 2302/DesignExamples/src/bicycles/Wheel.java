package bicycles;

/**
 * Created getters, setters, and constructors
 * 
 * @author rbrook46
 *
 */

public class Wheel {
	private String material;
	private int weightInGrams;
	private int rimDepthInMilimeters;
	private int priceInDollars;
	
	public Wheel(String material, int weightInGrams, int rimDepthInMilimeters,
			int priceInDollars) {
		super();
		this.material = material;
		this.weightInGrams = weightInGrams;
		this.rimDepthInMilimeters = rimDepthInMilimeters;
		this.priceInDollars = priceInDollars;
	
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(int weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

	public int getRimDepthInMilimeters() {
		return rimDepthInMilimeters;
	}

	public void setRimDepthInMilimeters(int rimDepthInMilimeters) {
		this.rimDepthInMilimeters = rimDepthInMilimeters;
	}

	public int getPriceInDollars() {
		return priceInDollars;
	}

	public void setPriceInDollars(int priceInDollars) {
		this.priceInDollars = priceInDollars;
	}
	
}
