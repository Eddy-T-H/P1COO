package rooms;
import dungeon.AbstractDungeon;

public class NormalExit extends ExitDecorator{
	
	public NormalExit(Room room){
		super.room = room;
	}

        @Override
	public boolean canExit(AbstractDungeon dungeon) {
		return true;
	}

}
