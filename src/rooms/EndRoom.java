package rooms;
import dungeon.AbstractDungeon;


public class EndRoom extends Room {

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.gameFinished();
		
	}

}
