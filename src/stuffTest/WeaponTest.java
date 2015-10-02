package stuffTest;

import junit.framework.TestCase;
import monstres.Moskito;
import static org.junit.Assert.*;

import org.junit.Test;
import stuff.ShortSword;
import stuff.Weapon;

public class WeaponTest extends TestCase{
    
    Weapon weapon;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        weapon = new ShortSword();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        weapon = null;
    }

	@Test
	public void testGetBaseDamage() {
		weapon.setBaseDamage(10);
                assertEquals(weapon.getBaseDamage(),10);
	}

	@Test
	public void testGetDamageRange() {
		weapon.setDamageRange(10);
                assertEquals(weapon.getDamageRange(),10);
	}

	@Test
	public void testSetBaseDamage() {
		weapon.setBaseDamage(10);
                assertEquals(weapon.getBaseDamage(),10);
	}

	@Test
	public void testSetDamageRange() {
		weapon.setDamageRange(10);
                assertEquals(weapon.getDamageRange(),10);
	}

	@Test
	public void testToString() {
		assertEquals(weapon.toString(),"Short Sword");
	}

}
