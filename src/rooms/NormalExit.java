package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author
 */
public class NormalExit extends ExitDecorator{
	
    /**
     *
     * @param room
     */
    public NormalExit(Room room){
		super.room = room;
	}

    /**
     *
     * @param dungeon
     * @return
     */
    @Override
	public boolean canExit(AbstractDungeon dungeon) {
		return true;
	}

}
