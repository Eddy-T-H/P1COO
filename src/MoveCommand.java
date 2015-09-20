import java.util.Map;

public class MoveCommand implements InterfaceCommand{

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		boolean success=false;
		for (Map.Entry<String, Room> room : dungeon.currentRoom.getNearRooms().entrySet()){
			if(room.getKey().toLowerCase().equals(command.toLowerCase())){
				room.getValue().exit();
				dungeon.setCurrentRoom(room.getValue());
				System.out.println("You change of room");
				success = true;
			}
		}
		if(!success){
			System.out.println("You can't move that way");
		}
	}

}
