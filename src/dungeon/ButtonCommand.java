package dungeon;


public class ButtonCommand implements InterfaceCommand {

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.currentRoom.exit(dungeon, command);
	}

}
