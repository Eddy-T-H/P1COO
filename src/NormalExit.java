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
	public void exit(AbstractDungeon dungeon, String command) {
		boolean success=false;
		for (Map.Entry<String, Room> room : dungeon.currentRoom.getNearRooms().entrySet()){
			if(room.getKey().toLowerCase().equals(command.toLowerCase())){
				dungeon.setCurrentRoom(room.getValue());
				System.out.println("You change of room");
				success = true;
			}
		}
		if(!success){
			System.out.println("You can't move that way");
		}
	}

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		room.action(command, dungeon);
	}
}
