/**
 * 
 */
package carModels;

/**
 * Objects of this class represent interior packages that
 * a prospective buyer can choose.
 * 
 * @author Ben Setzer
 *
 */
public class Interior {
	private String material;
	private int price;
	private Car installedIn;
	
	public Interior(String material, int price) {
		super();
		this.material = material;
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Car getInstalledIn() {
		return installedIn;
	}

	public void setInstalledIn(Car installedIn) {
		this.installedIn = installedIn;
	}
	

}