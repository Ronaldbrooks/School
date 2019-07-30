package cs2302.pictures;

public class Group extends Composite {
	
	/**
	 * When one component of a group is touched, the group
	 * returns itself, not the component.
	 */
	@Override
	public Picture getTouched(float x, float y) {
		if(super.getTouched(x, y) != null) {
			return this;
		} else {
			return null;
		}
	}

}
