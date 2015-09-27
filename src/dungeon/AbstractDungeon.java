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
        
        public Player getPlayer(){
            return this.player;
        }

	public void removeObject(Stuff object){
		this.player.getInventory().remove(object);
	}
	
	public abstract void interpretCommand(String command);
}

