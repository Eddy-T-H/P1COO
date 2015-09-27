import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDungeon {
	protected Room currentRoom;
	protected List<Stuff> inventory = new ArrayList<>();
	
	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room newCurrentRoom){
		this.currentRoom = newCurrentRoom;
	}
	
	public void addObject(Stuff object){
		this.inventory.add(object);
	}
        
        public boolean haveObject(String nameObject){
            for (Stuff object : this.inventory){
			if( (object.getClass().getName().toLowerCase()).equals(nameObject)){
				return true;
			}
		}
            return false;
        }
	
	public void removeObject(Stuff object){
		this.inventory.remove(object);
	}
	
	public abstract void interpretCommand(String command);
}

