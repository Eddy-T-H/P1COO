package rooms;

import java.util.ArrayList;
import java.util.List;

import dungeon.AbstractDungeon;
import stuff.Stuff;

/**
 * This class is the treasure room which contain a chest with several objects in it.
 * @author
 */
public class TreasureRoom extends Room {
	
	List<Stuff> chest = new ArrayList<>();
	
    /**
     * Constructor for the treasure room class
     * @param theObjects the content of the chest
     * @param description the description of the room
     */
    public TreasureRoom(List<Stuff> theObjects, String description){
		
		if(!(theObjects.isEmpty())){
			String objectList = "";
			for (Stuff object : theObjects){
				objectList+=object.getClass().getSimpleName() + " ";
			}
			this.chest.addAll(theObjects);
			super.setDescriptionRoom(description + "\nYou see a chest in that room and after open it, You see its content : " + objectList);
		}
		else{
			super.setDescriptionRoom(description);
		}
	}
	
    /**
     * Retrieve on object from the chest of the treasure room and then retrieve the object in the description
     * @param command the object that the user want to retrieve of the chest
     * @param dungeon the dungeon on which the player is
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		boolean taken = false;
		int objectToTake = 0;
		for (Stuff object : this.chest){
			if( (object.getClass().getSimpleName().toLowerCase()).equals(command.toLowerCase())){
				taken = true;
				objectToTake = this.chest.indexOf(object);
			}
		}
		if(taken){
			System.out.println("You take the " + this.chest.get(objectToTake).getClass().getSimpleName());
			dungeon.getPlayer().addObject(this.chest.get(objectToTake));
                        this.getDescriptionRoom().replace(this.chest.get(objectToTake).getClass().getSimpleName() + " ", "");
			this.chest.remove(objectToTake);
		}
		else{
			System.out.println("This chest doesn't contain this object: " + command);
		}
	}
}
