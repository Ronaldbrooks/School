package cs2302.pictures;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Picture {

	private List<Picture> components;

	public Composite(PicPoint base, List<Picture> components) {
		super(base);
		this.components = components;
	}

	public List<Picture> getComponents() {
		return components;
	}

	

	
	
}
