package dungeon;

import java.util.Map;

import rooms.HiddenExit;
import rooms.Room;
import stuff.Stuff;

public abstract class AbstractDungeon {
	protected Room currentRoom;
	protected Player player;
	protected boolean dungeonIsFinished=false;
	
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

public void interpretCommand(String command) {
		this.currentRoom.action(command, this);
	}
	
	public boolean isFinished(){
		return this.dungeonIsFinished;
	}
	public void gameFinished(){
		this.dungeonIsFinished=true;
	}
	
	public boolean roomHasHiddenExit(){
		for (Map.Entry<String, Room> roomRow : currentRoom.getNearRooms().entrySet()){
            if(roomRow.getValue().getClass().getSimpleName().equals("HiddenExit")){
            	((HiddenExit)roomRow.getValue()).discoverExit();
            	return true;
            }
        }
		return false;
	}
	
}

