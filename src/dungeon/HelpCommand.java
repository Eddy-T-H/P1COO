package dungeon;

/**
 * HelpCommand class
 * Proceed with the help command
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class HelpCommand implements InterfaceCommand{

    /**
     *  Proceed with the help command
     * @param command entered by the user
     * @param dungeon where the game is being played
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
		case "commands":
			System.out.println("Game commands : \n"
					+ "fight attack/use \n"
					+ "get description room\n"
					+ "get description around\n"
					+ "push button\n"
					+ "take \"item\"\n"
					+ "use item\n"
					+ "move \"direction\"\n"
					+ "help\n");
			break;
		case "here":
			switch(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().toLowerCase()){
				case "buttonroom":
					System.out.println("move \"direction\"\n");
					System.out.println("push \" button\" \n");
					System.out.println("use item\n");
					break;
				case "endroom":
					break;
				case "monsterroom":
					System.out.println("fight \"attack\"\n"
							+ "fight \"use\"");
					break;
				case "normalroom":
					System.out.println("move \"direction\"\n");
					System.out.println("use item\n");
					break;
				case "traproom":
					break;
				case "treasureroom":
					System.out.println("move \"direction\"\n");
					System.out.println("push \" button\" \n");
					System.out.println("use item\n");
					break;
			}
			break;
		default :
			System.out.println("Wrong argument");
		}
		
	}
	
}
