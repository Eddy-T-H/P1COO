package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class NormalExit extends Exit{
	
    /**
     * Builder
     * @param room
     */
    public NormalExit(Room room){
		super.room = room;
	}

    /**
     * Test if the exit can be leaved
     * @param dungeon current dungeon
     * @return true or false
     */
    @Override
	public boolean canExit(AbstractDungeon dungeon) {
		return true;
	}

}
