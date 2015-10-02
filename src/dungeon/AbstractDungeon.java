package dungeon;

import java.util.Map;

import rooms.HiddenExit;
import rooms.Room;
import stuff.Stuff;

/**
 * Abstract Class AbstractDungeon
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public abstract class AbstractDungeon {

    /**
     * Room where the player is located
     */
    protected Room currentRoom;

    /**
     * Player controlled by the user
     */
    protected Player player;

    /**
     * Boolean attribute that keeps the game going on
     */
    protected boolean dungeonIsFinished=false;
	
    /**
     * Getter
     * @return the Room where the player is located
     */
    public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
    /**
     * Setter allowing to change the room
     * @param newCurrentRoom
     */
    public void setCurrentRoom(Room newCurrentRoom){
		this.currentRoom = newCurrentRoom;
	}
        
    /**
     * Getter
     * @return Player controlled by the user
     */
    public Player getPlayer(){
        return this.player;
    }

    /**
     * Remove an item from the player's inventory
     * @param item that will be removed
     */
    public void removeObject(Stuff item){
		this.player.getInventory().remove(item);
	}

    /**
     * Function used to proceed with the user's inputs
     * @param user input
     */
    public void interpretCommand(String command) {
		this.currentRoom.action(command, this);
	}
	
    /**
     * Boolean that check the state of the game
     * @return true if finished, false if not
     */
    public boolean isFinished(){
		return this.dungeonIsFinished;
	}

    /**
     * Set the game to finished
     */
    public void gameFinished(){
		this.dungeonIsFinished=true;
	}
	
    /**
     *	Boolean checking if the room has an HiddenExit
     * @return boolean
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

