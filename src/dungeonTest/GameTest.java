package dungeonTest;

import dungeon.AbstractDungeon;
import dungeon.ConcreteDungeon;
import junit.framework.TestCase;

import org.junit.Test;

/**
 *
 * @author
 */
public class GameTest extends TestCase{
    protected AbstractDungeon dun;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        dun = new ConcreteDungeon();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        dun = null;
    }

    /**
     *
     */
    @Test
	public void testStart() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testGetCurrentDungeon() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testGetCurrentRoom() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testIsStuckInMonsterRoom() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testGetPlayer() {
		fail("Not yet implemented"); // TODO
	}
}
