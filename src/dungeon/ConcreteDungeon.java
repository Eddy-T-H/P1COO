import java.util.ArrayList;
import java.util.List;

public class ConcreteDungeon extends AbstractDungeon {
	public ConcreteDungeon(){
		List<Stuff> objects = new ArrayList<>();
		objects.add(new Potion());
		objects.add(new Key());
		this.currentRoom = new TreasureRoom(objects, "This is a treasure room");
		this.currentRoom = new NormalExit(this.currentRoom);
		this.currentRoom.addNearRoom("West", new LockedExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("East", new NormalExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("North", new HiddenExit (new NormalRoom("This is a normal room")));
	}

	@Override
	public void interpretCommand(String command) {
		this.currentRoom.action(command, this);
	}
}