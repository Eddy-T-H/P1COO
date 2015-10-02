package monstresTest;

import junit.framework.TestCase;
import monstres.Monster;
import monstres.Moskito;

import org.junit.Test;

public class MoskitoTest extends TestCase {
    
        private Monster monster;
        
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        monster = new Moskito();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        monster = null;
    }

	@Test
	public void testGetHealthPoint() {
            assertEquals(monster.getHealthPoint(),5);
	}

	@Test
	public void testGetBaseDamage() {
            assertEquals(monster.getBaseDamage(),1);
	}

	@Test
	public void testGetDamageRange() {
            assertEquals(monster.getDamageRange(),1);
	}

	@Test
	public void testGetName() {
            assertEquals(monster.getDamageRange(),"Moskito");
	}

	@Test
	public void testTakeDamage() {
            monster.takeDamage(2);
            assertEquals(monster.getHealthPoint(),3);
	}

	@Test
	public void testIsAlive() {
            assertTrue(monster.isAlive());
            monster.takeDamage(6);
            assertFalse(monster.isAlive());
	}

	@Test
	public void testDamageMonster() {
		fail("Not yet implemented"); // TODO
	}

}
