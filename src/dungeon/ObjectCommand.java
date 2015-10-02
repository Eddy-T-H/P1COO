package dungeon;
import rooms.ExitDecorator;

/**
 *
 * @author
 */
public class ObjectCommand implements InterfaceCommand {

    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		if (((ExitDecorator)(dungeon.getCurrentRoom())).getRoom().getClass().getSimpleName().equals("TreasureRoom"))
			dungeon.interpretCommand(command);
		else 
			System.out.println("This room does't permit that action");
	}

}
