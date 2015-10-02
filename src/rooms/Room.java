package rooms;

import java.util.HashMap;
import java.util.Map;
import dungeon.AbstractDungeon;

/**
 * Room Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public abstract class Room {
	private String descriptionRoom="";
	private String descriptionAround="";
	private Map<String,Room> around = new HashMap<>();
	
    /**
     * Setter for the description
     * @param description new description
     */
    protected void setDescriptionRoom (String description){
		this.descriptionRoom=description;
	}

    /**
     * Getter for this object
     * @return this room
     */
    public Room getRoom(){
		return this;
	}
	
    /**
     * Getter for the description
     * @return description
     */
    public String getDescriptionRoom(){
		return this.descriptionRoom;
	}
	
    /**
     * Getter for the description around
     * @return description around
     */
    public String getDescriptionAround(){
		return this.descriptionAround;
	}
	
    /**
     * Place a room next to this one.
     * @param placementKey direction
     * @param room object room
     */
    public void addNearRoom(String placementKey, Room room){
		this.around.put(placementKey,room);
		if(!(room.getNearRooms().containsValue(this))){
			String place="";
			switch(placementKey){
			case "West": 
				place = "East";
				break;
			case "East": 
				place = "West";
				break;
			case "South": 
				place = "North";
				break;
			case "North": 
				place = "South";
				break;
			}
			room.addNearRoom(place , this);
		}
		this.around.put(placementKey,room);
		this.descriptionAround+= placementKey + ":" + room.getClass().getSimpleName() + " ";
	}

    /**
     * Getter for rooms around
     * @return rooms
     */
    public Map<String,Room> getNearRooms(){
		return this.around;
	}
        
    /**
     * Method used to leave the round
     * @param dungeon current dungeon
     * @param command user command
     */
    public void exit(AbstractDungeon dungeon, String command){}
	
    /**
     * Proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    abstract public void action(String command, AbstractDungeon dungeon);
    
    
    /**
     * Test if the room is an end room
     * @return true or false
     */
    public boolean isAnEndRoom(){
    	return false;
    }
    
}
