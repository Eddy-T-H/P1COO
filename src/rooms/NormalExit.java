package rooms;

import java.util.Map;

import dungeon.AbstractDungeon;


public class NormalExit extends ExitDecorator{
	
	public NormalExit(Room room){
		super.room = room;
	}
	
	@Override
	public String getDescriptionRoom(){
		return this.room.getDescriptionRoom();
	}

	@Override
	public boolean canExit(AbstractDungeon dungeon) {
		return true;
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		room.action(command, dungeon);
	}
}
