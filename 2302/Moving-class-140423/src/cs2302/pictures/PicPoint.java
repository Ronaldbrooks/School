package cs2302.pictures;

public class PicPoint {
	private float x, y;

	
	
	public PicPoint(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	/**
	 * Moves the point to a new position, (newX, newY).
	 * 
	 * Sometimes called a 'translate' because the point moves without scaling
	 * or rotating.
	 * 
	 */
	public void moveAbsolute(float newX, float newY) {
		x = newX;
		y = newY;
	}

	/**
	 * Move the point to a new position given by the amount the coordinates
	 * will change.
	 * 
	 * (dx,dy) is often called a 'vector' since it indicates a direction and distance
	 * rather than a position.
	 * 
	 * @param dx   Change in the x coordinate
	 * @param dy   Change in the y coordinate
	 */
	public void moveRelative(float dx, float dy) {
		x += dx;
		y += dy;
	}
	
}













