package dungeon;

/**
 *
 * @author
 */
public class ButtonCommand implements InterfaceCommand {

    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.currentRoom.action(command, dungeon);
	}

}
