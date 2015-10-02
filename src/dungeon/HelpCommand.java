package dungeon;


public class HelpCommand implements InterfaceCommand{

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
		case "commands":
			System.out.println("Game commands : \n"
					+ "fight\n"
					+ "get description room\n"
					+ "get description around\n"
					+ "push\n"
					+ "take\n"
					+ "use\n"
					+ "move\n"
					+ "help\n");
			break;
		case "here":
			switch(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().toLowerCase()){
				case "buttonroom":
					System.out.println("move\n");
					System.out.println("push\n");
					System.out.println("use\n");
					break;
				case "endroom":
					break;
				case "monsterroom":
					System.out.println("fight\n");
					break;
				case "normalroom":
					System.out.println("move\n");
					System.out.println("use\n");
					break;
				case "traproom":
					break;
				case "treasureroom":
					System.out.println("move\n");
					System.out.println("use\n");
					System.out.println("take\n");
					break;
			}
			break;
		default :
			System.out.println("Wrong argument");
		}
		
	}
	
}
