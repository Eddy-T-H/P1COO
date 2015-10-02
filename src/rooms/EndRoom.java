package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author 
 */
public class EndRoom extends Room {
	
    /**
     *
     * @param description
     */
    public EndRoom(String description){
		super.setDescriptionRoom(description);
	}

    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.gameFinished();
	}

}
