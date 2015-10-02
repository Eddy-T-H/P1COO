package dungeon;
import rooms.ExitDecorator;


public class ObjectCommand implements InterfaceCommand {

	@Override
	public void action(String command, AbstractDungeon dungeon) {
			switch(command.toLowerCase()){
			case "take":
				if (((ExitDecorator)(dungeon.getCurrentRoom())).getRoom().getClass().getSimpleName().equals("TreasureRoom"))
					dungeon.interpretCommand(command);
				else 
					System.out.println("This room does't permit that action");
				break;
			case "use": 	
				dungeon.getPlayer().use();
				break;
			default: 		
				System.out.println("/!\\ Wrong direction: '" + command + "' isn't recognized /!\\");
			}

	}

}



