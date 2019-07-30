package bicycles;


/**
 * Bicycle and Wheel are used to demonstrate simple relationships between
 * 	classes and objects.
 * 
 * @author Ben Setzer
 *
 */
public class Wheel {
	private String material;
	private int weightInGrams;
	private int rimDepthInMilimeters;
	private int priceInDollars;
	private Bicycle installON;	// the bicycle on which this wheel is installed
  								// The initial value is null since we don't specify
								// one otherwise

	public Bicycle getInstallON() {
		return installON;
}

	public void setInstallON(Bicycle installON) {
		this.installON = installON;
}

	
	
	
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
