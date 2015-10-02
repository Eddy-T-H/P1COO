package dungeonTest;

import dungeon.Player;
import junit.framework.TestCase;

import org.junit.Test;
import stuff.HealingPotion;
import stuff.MediumHealingPotion;
import stuff.ShortSword;
import stuff.Stuff;
import stuff.Weapon;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class PlayerTest extends TestCase{
    
    protected Player player;
        
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        player = new Player();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        player = null;
    }

    /**
     *
     */
    @Test
	public void testGetMaxHealth() {
		assertEquals(player.getMaxHealth(),100);
	}

    /**
     *
     */
    @Test
	public void testSetMaxHealth() {
		player.setMaxHealth(200);
                assertEquals(player.getMaxHealth(),200);
	}

    /**
     *
     */
    @Test
	public void testGetHealthpoint() {
		assertEquals(player.getHealthpoint(),100);
	}

    /**
     *
     */
    @Test
	public void testSetHealthpoint() {
		player.setHealthpoint(50);
                assertEquals(player.getHealthpoint(),50);
	}

    /**
     *
     */
    @Test
	public void testGetEquipedWeapon() {
		player.getEquipedWeapon();
	}

    /**
     *
     */
    @Test
	public void testSetEquipedWeapon() {
                Weapon weapon = new ShortSword();
                player.setEquipedWeapon(weapon);
		player.getEquipedWeapon();
	}
        
   /**
     *
     */
    @Test
	public void testAddObject() {
		Stuff weapon = new ShortSword();
                player.addObject(weapon);
                player.getInventory();
	}

    /**
     *
     */
    @Test
	public void testGetInventory() {
		Stuff weapon = new ShortSword();
                player.addObject(weapon);
                player.getInventory();
	}


    /**
     *
     */
    @Test
	public void testPrintInventory() {
		Stuff weapon = new ShortSword();
                player.addObject(weapon);
                player.printInventory();
	}

    /**
     *
     */
    @Test
	public void testHaveObject() {
		Stuff weapon = new ShortSword();
                player.addObject(weapon);
                assertTrue(player.haveObject("ShortSword"));
	}

    /**
     *
     */
    @Test
	public void testDamagePlayer() {
		fail("Random"); // TODO
	}

    /**
     *
     */
    @Test
	public void testTakeDamage() {
		player.takeDamage(20);
                assertEquals(player.getHealthpoint(),80);
	}

    /**
     *
     */
    @Test
	public void testUseHealingPotion() {
                HealingPotion pot = new MediumHealingPotion();
		player.takeDamage(25);
                player.useHealingPotion(pot);
                assertEquals(player.getHealthpoint(),85);
	}

    /**
     *
     */
    @Test
	public void testUseSharpeningPotion() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testIsDead() {
		assertFalse(player.isDead());
                player.takeDamage(200);
                assertTrue(player.isDead());
	}

}
