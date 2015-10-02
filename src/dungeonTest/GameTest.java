package dungeonTest;

import dungeon.Game;
import junit.framework.TestCase;

import org.junit.Test;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class GameTest extends TestCase{
    protected Game game;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        game = new Game();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        game = null;
    }
    
    /**
     *
     */
    @Test
	public void testIsStuckInMonsterRoom() {
		assertFalse(game.isStuckInMonsterRoom());
	}
}
