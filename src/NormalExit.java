
public class NormalExit extends ExitDecorator{
	
	public NormalExit(Room room){
		super.room = room;
	}

	@Override
	public void exit() {
		// TODO Auto-generated method stub
		System.out.println("You can exit this room");
	}

	@Override
	public void action(String command) {
		// TODO Auto-generated method stub
		room.action(command);
	}
}
