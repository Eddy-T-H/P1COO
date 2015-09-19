import java.util.List;

public abstract class AbstractDungeon {
	protected Room currentRoom;
	protected List<Stuff> inventory;
	
	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	public abstract void interpretCommand(String command);
}
