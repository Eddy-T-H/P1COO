package dungeon;

import java.util.Map;

import rooms.HiddenExit;
import rooms.Room;
import stuff.Stuff;

/**
 *
 * @author
 */
public abstract class AbstractDungeon {

    /**
     *
     */
    protected Room currentRoom;

    /**
     *
     */
    protected Player player;

    /**
     *
     */
    protected boolean dungeonIsFinished=false;
	
    /**
     *
     * @return
     */
    public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
    /**
     *
     * @param newCurrentRoom
     */
    public void setCurrentRoom(Room newCurrentRoom){
		this.currentRoom = newCurrentRoom;
	}
        
    /**
     *
     * @return
     */
    public Player getPlayer(){
        return this.player;
    }

    /**
     *
     * @param object
     */
    public void removeObject(Stuff object){
		this.player.getInventory().remove(object);
	}

    /**
     *
     * @param command
     */
    public void interpretCommand(String command) {
		this.currentRoom.action(command, this);
	}
	
    /**
     *
     * @return
     */
    public boolean isFinished(){
		return this.dungeonIsFinished;
	}

    /**
     *
     */
    public void gameFinished(){
		this.dungeonIsFinished=true;
	}
	
    /**
     *
     * @return
     */
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

