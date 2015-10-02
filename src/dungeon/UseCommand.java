package dungeon;

public class UseCommand implements InterfaceCommand {
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
			case "item":
				dungeon.getPlayer().use();
				break;
			default:
				System.out.println("Wrong argument");
				break;
		}
	}
}


