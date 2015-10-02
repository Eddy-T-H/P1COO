package monstresTest;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import monstres.Monster;
import monstres.Troll;

import org.junit.Test;

/**
 *
 * @author
 */
public class TrollTest extends TestCase {
    
        private Monster monster;
        
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        monster = new Troll();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        monster = null;
    }

    /**
     *
     */
    @Test
	public void testGetHealthPoint() {
            assertEquals(monster.getHealthPoint(),60);
	}

    /**
     *
     */
    @Test
	public void testGetBaseDamage() {
            assertEquals(monster.getBaseDamage(),10);
	}

    /**
     *
     */
    @Test
	public void testGetDamageRange() {
            assertEquals(monster.getDamageRange(),10);
	}

    /**
     *
     */
    @Test
	public void testGetName() {
            assertEquals(monster.getDamageRange(),"Troll");
	}

    /**
     *
     */
    @Test
	public void testTakeDamage() {
            monster.takeDamage(20);
            assertEquals(monster.getHealthPoint(),40);
	}

    /**
     *
     */
    @Test
	public void testIsAlive() {
            assertTrue(monster.isAlive());
            monster.takeDamage(61);
            assertFalse(monster.isAlive());
	}

    /**
     *
     */
    @Test
	public void testDamageMonster() {
		fail("Not yet implemented"); // TODO
	}

}
