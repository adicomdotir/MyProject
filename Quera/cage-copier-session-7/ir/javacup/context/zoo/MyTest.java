package ir.javacup.context.zoo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTest {
	private Cage c01, c02;
	
	@Before
	public void before() {
		c01 = new Cage();
		c02 = new Cage();
	}

	@Test
	public void firstTest() {
		c01.setId(1);
		c01.setName(null);
		Bird[] birds = new Bird[2];
		birds[0] = new Bird();
		birds[0].setColor(null);
		birds[0].setName(null);
		birds[1] = null;
		c01.setBirds(birds);
		new CageCopier().copy(c01, c02);
		assertNotNull(c02);
		assertEquals(1, c02.getId());
		assertNull(c02.getName());
		assertNotNull(c02.getBirds()[0]);
		assertNull(c02.getBirds()[0].getColor());
		assertNull(c02.getBirds()[0].getName());
		assertNull(c02.getBirds()[1]);
	}
}
