package test;

import static org.junit.Assert.*;
import kinship.Person;

import org.junit.Before;
import org.junit.Test;

public class TestKinship {

	private Person alice, beth, carol, dawn, eve;
	
	
	public TestKinship(Person alice, Person beth, Person carol, Person dawn,
			Person eve) {
		super();
		this.alice = alice;
		this.beth = beth;
		this.carol = carol;
		this.dawn = dawn;
		this.eve = eve;
	}

	@Before
	public void setUp() throws Exception {
		alice = new Person("alice", null);
		beth = new Person("beth", alice);
		carol = new Person("carol", alice);
		dawn = new Person("dawn", beth);
		eve = new Person("eve", carol);
	}

	@Test
	public void testSiblings() {
		assertTrue(beth.isSiblingOf(carol));
		assertFalse(beth.isSiblingOf(alice));
		assertFalse(dawn.isSiblingOf(eve));
	}
	
	@Test
	public void testCousins() {
		assertTrue(dawn.isCousinOf(eve));
		assertFalse(beth.isCousinOf(carol));
		assertFalse(alice.isCousinOf(beth));
	}
	
	@Test
	public void testChildOf() {
		assertTrue(beth.isChildOf(alice));
		assertTrue(dawn.isChildOf(beth));
		assertFalse(dawn.isChildOf(alice));
	}
	
	@Test 
	public void testParentOf() {
		assertTrue(alice.isParentOf(beth));
		assertTrue(carol.isParentOf(eve));
		assertFalse(beth.isParentOf(alice));
		assertFalse(carol.isParentOf(beth));
	}

}
