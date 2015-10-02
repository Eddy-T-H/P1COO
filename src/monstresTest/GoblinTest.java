package monstresTest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import monstres.Goblin;
import monstres.Monster;

import org.junit.Test;

public class GoblinTest extends TestCase {
    
        private Monster monster;
        
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        monster = new Goblin();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        monster = null;
    }

	@Test
	public void testGetHealthPoint() {
            assertEquals(monster.getHealthPoint(),30);
	}

	@Test
	public void testGetBaseDamage() {
            assertEquals(monster.getBaseDamage(),5);
	}

	@Test
	public void testGetDamageRange() {
            assertEquals(monster.getDamageRange(),3);
	}

	@Test
	public void testGetName() {
            assertEquals(monster.getDamageRange(),"Goblin");
	}

	@Test
	public void testTakeDamage() {
            monster.takeDamage(10);
            assertEquals(monster.getHealthPoint(),20);
	}

	@Test
	public void testIsAlive() {
            assertTrue(monster.isAlive());
            monster.takeDamage(31);
            assertFalse(monster.isAlive());
	}

	@Test
	public void testDamageMonster() {
		fail("Not yet implemented"); // TODO
	}

}
