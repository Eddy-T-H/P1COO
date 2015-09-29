package dungeon;

public class MoveCommand implements InterfaceCommand{

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command.toLowerCase()){
		case "west":
		case "north":
		case "south":
		case "east": 	dungeon.currentRoom.exit(dungeon, command);
						break;
		default: 		System.out.println("/!\\ Wrong direction: '" + command + "' isn't recognized /!\\");
		}
	}

}
