/**
 * 
 */
package carModels;

/**
 * 
 * This class represents radios that a prospective car buyer can choose
 * for his or her car.
 * 
 * @author Ben Setzer
 *
 */
public class Radio {
	
	private String description;
	private int price;
	private Car installedIn;
	
	public Radio(String description, int price) {
		super();
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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