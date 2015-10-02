package dungeonTest;

import dungeon.ConcreteDungeon;
import junit.framework.TestCase;

import org.junit.Test;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ConcreteDungeonTest extends TestCase{
    protected ConcreteDungeon dun;
    
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
	public void testIsFinished() {
		assertFalse(dun.isFinished());
                dun.gameFinished();
                assertTrue(dun.isFinished());
	}

    /**
     *
     */
    @Test
	public void testRoomHasHiddenExit() {
		assertTrue(dun.roomHasHiddenExit());
                dun.setCurrentRoom(dun.getCurrentRoom().getNearRooms().get("East"));
                assertFalse(dun.roomHasHiddenExit());
	}
}
