package dungeon;

import rooms.Room;

public abstract class AbstractDungeon {
	protected Room currentRoom;
	protected Player player;
	
	
	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	public void setCurrentRoom(Room newCurrentRoom){
		this.currentRoom = newCurrentRoom;
	}
	
	public void addObject(Stuff object){
		this.player.getInventory().add(object);
	}
        
        public boolean haveObject(String nameObject){
            for (Stuff object : this.player.getInventory()){
			if( (object.getClass().getName().toLowerCase()).equals(nameObject)){
				return true;
			}
		}
            return false;
        }
	
	public void removeObject(Stuff object){
		this.player.getInventory().remove(object);
	}
	
	public abstract void interpretCommand(String command);
}

