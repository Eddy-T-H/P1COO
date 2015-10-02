package dungeon;

/**
 *
 * @author
 */
public interface InterfaceCommand {
	
    /**
     *
     * @param command
     * @param dungeon
     */
    public abstract void action(String command, AbstractDungeon dungeon);
	
}
