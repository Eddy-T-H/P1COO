package stuffTest;

import junit.framework.TestCase;
import monstres.Moskito;
import static org.junit.Assert.*;

import org.junit.Test;
import stuff.HealingPotion;
import stuff.MediumHealingPotion;

public class HealingPotionTest extends TestCase{
    protected HealingPotion pot;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        pot = new MediumHealingPotion();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        pot = null;
    }

	@Test
	public void testGetHealingPoints() {
		assertEquals(pot.getHealingPoints(),20);
	}

	@Test
	public void testToString() {
		assertEquals(pot.toString(),"Medium Healing Potion");
	}

}
