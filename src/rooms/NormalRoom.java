package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class NormalRoom extends Room {
	
    /**
     *
     * @param description
     */
    public NormalRoom(String description){
		super.setDescriptionRoom(description);
	}

    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		System.out.println("You have nothing to do here");
	}

}
