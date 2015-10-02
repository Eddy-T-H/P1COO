package dungeon;
import rooms.ExitDecorator;

/**
 * ObjectCommand Class
 * Proceed with the take command
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ObjectCommand implements InterfaceCommand {

    /**
     *  Proceed with the take command
     * @param command entered by the user
     * @param dungeon where the game is being played
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		if (((ExitDecorator)(dungeon.getCurrentRoom())).getRoom().getClass().getSimpleName().equals("TreasureRoom"))
			dungeon.interpretCommand(command);
		else 
			System.out.println("This room does't permit that action");
	}

}
