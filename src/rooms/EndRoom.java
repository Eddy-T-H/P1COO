package rooms;
import dungeon.AbstractDungeon;


public class EndRoom extends Room {
	
	public EndRoom(String description){
		super.setDescriptionRoom(description);
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.gameFinished();
	}

}
