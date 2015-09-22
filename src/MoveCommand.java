public class MoveCommand implements InterfaceCommand{

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.currentRoom.exit(dungeon, command);
	}

}
