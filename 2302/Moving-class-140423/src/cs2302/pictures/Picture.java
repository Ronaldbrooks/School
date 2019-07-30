package cs2302.pictures;

import android.graphics.Canvas;

public abstract class Picture {
	private PicPoint base;
	
	private OnPictureTouchListener pictureTouchListener;

	public Picture(PicPoint base) {
		this.base = base;
	}

	public PicPoint getBase() {
		return base;
	}

	public void setBase(PicPoint base) {
		this.base = base;
	}
	
	
	public OnPictureTouchListener getPictureTouchListener() {
		return pictureTouchListener;
	}

	public void setPictureTouchListener(OnPictureTouchListener pictureTouchListener) {
		this.pictureTouchListener = pictureTouchListener;
	}

	public void dispatchTouch(float x, float y) {
		Picture p = getTouched(x, y);
		if(p != null && pictureTouchListener != null) {
			p.pictureTouchListener.onPictureTouch(p,x,y);
		}
	}
	
	public abstract void draw(Canvas cnv);
	
	public abstract Picture getTouched(float x, float y);
	
	
	public static interface OnPictureTouchListener {
		public void onPictureTouch(Picture target, float x, float y);
	}
	
	/**
	 * Move will change the base point.
	 */
	
	public void moveAbsolute(float newX, float newY) {
		base.moveAbsolute(newX, newY);
	}
	
	public void moveRelative(float dx, float dy) {
		base.moveRelative(dx, dy);
	}
	
}


















