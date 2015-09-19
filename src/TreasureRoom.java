import java.util.ArrayList;
import java.util.List;

public class TreasureRoom extends Room {
	
	List<Stuff> objects = new ArrayList<>();
	
	public TreasureRoom(List<Stuff> theObjects){
		super.setDescription("This is a treasure room");
		if(!(theObjects.isEmpty())){
			this.objects.addAll(theObjects);
		}
	}
	
	@Override
	public void action(String command) {
		boolean taken=false;
		for (Stuff object : this.objects){
			if( (object.getClass().getName().toLowerCase()).equals(command.toLowerCase())){
				taken = true;
			}
		}
		if(taken)
			System.out.println("you take the object");
		else
			System.out.println("this chest doesn't contain " + command);
	}
}
