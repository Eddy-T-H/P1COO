package dungeon;

/**
 *	ButtonCommand Class 
 *	Proceed with the push input
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ButtonCommand implements InterfaceCommand {

    /**
     *	Proceed with the 'push' input
     * @param command entered by the user
     * @param dungeon where the game take place
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.currentRoom.action(command, dungeon);
	}

}
