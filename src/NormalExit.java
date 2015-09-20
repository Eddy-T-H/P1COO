
public class NormalExit extends ExitDecorator{
	
	public NormalExit(Room room){
		super.room = room;
	}
	
	@Override
	public String getDescriptionRoom(){
		return this.room.getDescriptionRoom();
	}

	@Override
	public void exit() {
		System.out.println("You can exit this room");
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		room.action(command, dungeon);
	}
}
