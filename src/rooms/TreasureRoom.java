package rooms;

import java.util.ArrayList;
import java.util.List;

import dungeon.AbstractDungeon;
import dungeon.Stuff;

public class TreasureRoom extends Room {
	
	List<Stuff> chest = new ArrayList<>();
	
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
			dungeon.addObject(this.chest.get(objectToTake));
			this.setDescriptionRoom(this.getDescriptionRoom().replace(this.chest.get(objectToTake).getClass().getSimpleName() + " ", ""));
			this.chest.remove(objectToTake);
		}
		else{
			System.out.println("This chest doesn't contain this object: " + command);
		}
	}
}
