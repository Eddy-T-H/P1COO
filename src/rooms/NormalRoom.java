package rooms;
import dungeon.AbstractDungeon;


public class NormalRoom extends Room {
	
	public NormalRoom(String description){
		super.setDescriptionRoom(description);
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		System.out.println("You have nothing to do here");
	}

}
