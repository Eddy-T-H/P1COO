package rooms;

import java.util.HashMap;
import java.util.Map;
import dungeon.AbstractDungeon;

public abstract class Room {
	private String descriptionRoom="";
	private String descriptionAround="";
	private Map<String,Room> around = new HashMap<>();
	
	protected void setDescriptionRoom (String description){
		this.descriptionRoom=description;
	}

	public Room getRoom(){
		return this;
	}
	
	public String getDescriptionRoom(){
		return this.descriptionRoom;
	}
	
	public String getDescriptionAround(){
		return this.descriptionAround;
	}
	
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

	public Map<String,Room> getNearRooms(){
		return this.around;
	}
        
	public void exit(AbstractDungeon dungeon, String command){}
	
	abstract public void action(String command, AbstractDungeon dungeon);
}
