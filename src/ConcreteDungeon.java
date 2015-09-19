import java.util.ArrayList;
import java.util.List;

public class ConcreteDungeon extends AbstractDungeon {
	public ConcreteDungeon(){
		List<Stuff> objects = new ArrayList<>();
		objects.add(new Potion());
		objects.add(new Key());
		this.currentRoom = new TreasureRoom(objects);
		this.currentRoom = new NormalExit(this.currentRoom);
	}

	@Override
	public void interpretCommand(String command) {
		this.currentRoom.action(command);
	}
}