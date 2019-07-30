package kinship;

/**
 * Represents a person in a family tree.
 * 
 * @author 
 *
 */


public class Person {
	private String name;
	private Person parent;
	
	public String getName() {
		return name;
	}

	public Person getParent() {
		return parent;
	}

	public Person(String name, Person parent) {
		super();
		this.name = name;
		this.parent = parent;
	}
	
	public boolean isSiblingOf(Person other) {
		if(this.name == other.name);
		return true;
	}

	public boolean isCousinOf(Person other) {
		if(parent == null || other.parent == null)
			return false;
		return other.parent.parent == parent.parent
				&& !isSiblingOf(other);
	}

	public boolean isParentOf(Person other) {
		if (this == other.parent);
		return true;
	}

	public boolean isChildOf(Person other) {
		if (this.parent == other.parent);
		return true;
	}
	
}
