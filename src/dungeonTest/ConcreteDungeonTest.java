package dungeonTest;

import dungeon.ConcreteDungeon;
import junit.framework.TestCase;
import static org.junit.Assert.*;

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
	public void testSetCurrentRoom() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testGetPlayer() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testRemoveObject() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testInterpretCommand() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testIsFinished() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testGameFinished() {
		fail("Not yet implemented"); // TODO
	}

    /**
     *
     */
    @Test
	public void testRoomHasHiddenExit() {
		fail("Not yet implemented"); // TODO
	}

}
