package dungeon;

/**
 * Interface shared by all the command classes
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public interface InterfaceCommand {
	
    /**
     * Method that proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    public abstract void action(String command, AbstractDungeon dungeon);
	
}
