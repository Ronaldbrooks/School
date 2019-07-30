package cs2302.pictures;

import java.util.ArrayList;

import android.graphics.Canvas;

public class Composite extends Picture {

	private ArrayList<Picture> components;

	public Composite(PicPoint base) {
		super(base);
		components = new ArrayList<Picture>();
		// components is now an empty list of pictures
	}
	
	public Composite() {
		this(new PicPoint(0, 0));
	}

	public ArrayList<Picture> getComponents() {
		return components;
	}

	/**
	 * Add the picture pic to the end of the components list.
	 * @param pic
	 */
	public void addPicture(Picture pic) {
		components.add(pic);
	}
	
	@Override
	public void draw(Canvas cnv) {
		
		for(Picture pic: components) {
			pic.draw(cnv);
		}
	}

	@Override
	public Picture getTouched(float x, float y) {
		for(int i = components.size()-1; i >= 0; i--) {
			Picture pic = components.get(i);
			Picture p = pic.getTouched(x, y);
			if(p != null) {
				return  p;
			}
		}
		return null;
	}
	
	/**
	 * Moves each component.
	 * 
	 * This is, however, not all that useful.
	 */
	@Override
	public void moveAbsolute(float newX, float newY) {
		super.moveAbsolute(newX, newY);
		for(Picture p : components) {
			p.moveAbsolute(newX, newY);
		}
	}

	/**
	 * Moves each component.
	 */
	@Override
	public void moveRelative(float dx, float dy) {
		super.moveRelative(dx, dy);
		for(Picture p: components) {
			p.moveRelative(dx, dy);
		}
	}
	
}









