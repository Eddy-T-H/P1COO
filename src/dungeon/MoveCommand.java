package dungeon;

/**
 * MoveCommand Class
 * Proceed with the move command
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class MoveCommand implements InterfaceCommand{

    /**
     *  Proceed with the move command
     * @param command entered by the user
     * @param dungeon where the game is being played
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		switch (command.toLowerCase()) {
		case "west":
		case "north":
		case "south":
		case "east":
			dungeon.currentRoom.exit(dungeon, command);
			break;
		default:
			System.out.println("/!\\ Wrong direction: '" + command + "' isn't recognized /!\\");
		}
	}

}
