import java.util.Map;

public class NormalExit extends ExitDecorator{
	
	public NormalExit(Room room){
		super.room = room;
	}
	
	@Override
	public String getDescriptionRoom(){
		return this.room.getDescriptionRoom();
	}

	@Override
	public void canExit(AbstractDungeon dungeon, String command) {
		this.exit(dungeon, command);
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		room.action(command, dungeon);
	}
}
