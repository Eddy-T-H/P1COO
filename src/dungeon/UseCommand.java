package dungeon;

/**
 *	UseCommand Classe
 *	Proceed with the use command
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class UseCommand implements InterfaceCommand {

    /**
     *  Proceed with the use description command
     * @param command entered by the user
     * @param dungeon where the game is being played
     */
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


