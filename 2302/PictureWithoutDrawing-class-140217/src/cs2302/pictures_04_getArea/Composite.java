package cs2302.pictures_04_getArea;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Picture {

	private ArrayList<Picture> components;

	public Composite(PicPoint base, ArrayList<Picture> components) {
		super(base);
		this.components = components;
	}

	public List<Picture> getComponents() {
		return components;
	}

	

	
	
}
