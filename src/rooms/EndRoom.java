package rooms;
import dungeon.AbstractDungeon;

/**
 *	EndRoom
 * Final Room
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class EndRoom extends Room {
	
    /**
     * Builder
     * @param description
     */
    public EndRoom(String description){
		super.setDescriptionRoom(description);
	}

    /**
     * Proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.gameFinished();
	}
    
    
    /**
     * Test if the room is an end room
     * @return true or false
     */
    @Override
    public boolean isAnEndRoom(){
    	return true;
    }

}
