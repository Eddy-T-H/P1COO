package monstresTest;

import junit.framework.TestCase;
import monstres.Monster;
import monstres.Moskito;

import org.junit.Test;

/**
 * Test class for the class Moskito
 * @author
 */
public class MoskitoTest extends TestCase {
    
        protected Monster monster;
        
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

    /**
     * Test of the getHealthPoint method
     */
    @Test
	public void testGetHealthPoint() {
            assertEquals(monster.getHealthPoint(),5);
	}

    /**
     * Test of the getBaseDamage method
     */
    @Test
	public void testGetBaseDamage() {
            assertEquals(monster.getBaseDamage(),1);
	}

    /**
     * Test of the getDamageRange method
     */
    @Test
	public void testGetDamageRange() {
            assertEquals(monster.getDamageRange(),1);
	}

    /**
     * Test of the getName method
     */
    @Test
	public void testGetName() {
            assertEquals(monster.getName(),"Moskito");
	}

    /**
     * Test of the takeDamage method
     */
    @Test
	public void testTakeDamage() {
            monster.takeDamage(2);
            assertEquals(monster.getHealthPoint(),3);
	}

    /**
     * Test of the isAlive method
     */
    @Test
	public void testIsAlive() {
            assertTrue(monster.isAlive());
            monster.takeDamage(6);
            assertFalse(monster.isAlive());
	}

    /**
     * Test of the damageMonster method
     */
    @Test
	public void testDamageMonster() {
		assertTrue(monster.damageMonster()<=(monster.getBaseDamage()+monster.getDamageRange()));
	}

}
