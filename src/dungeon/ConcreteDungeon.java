package dungeon ;
import java.util.ArrayList;
import java.util.List;

import monstres.*;
import stuff.*;
import rooms.*;

/**
 *
 * @author
 */
public class ConcreteDungeon extends AbstractDungeon {

    /**
     * Constrcutor without param
     */
    public ConcreteDungeon(){
		Room room;
		List<Stuff> objects = new ArrayList<>();
        this.player = new Player();
		objects.add(new MediumHealingPotion());
		objects.add(new Key());
		objects.add(new GreatHammer());
		this.currentRoom = new NormalExit(new TreasureRoom (objects, "This is a treasure room"));
		this.currentRoom.addNearRoom("West", new LockedExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("East", new NormalExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("North", new HiddenExit (new MonsterRoom(new Troll(),"This is a Troll cave")));
		room=this.currentRoom.getNearRooms().get("West");
		room.addNearRoom("North", new NormalExit (new ButtonRoom("This is a button room")));
		room=room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit (new NormalRoom("This is a normal room")));
		room=room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit (new MonsterRoom(new Moskito(),"This is a normal room")));
	}
	
	
	// For level2+

    /**
     * ConcreteDungeon's constructor with a player as param
     * @param p the player from the last dungeon
     */
    	public ConcreteDungeon(Player p){
		Room room;
		List<Stuff> objects = new ArrayList<>();
        this.player = p;
		objects.add(new MediumHealingPotion());
		objects.add(new Key());
		objects.add(new GreatHammer());
		this.currentRoom = new NormalExit(new TreasureRoom (objects, "This is a treasure room"));
		this.currentRoom.addNearRoom("West", new LockedExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("East", new NormalExit (new NormalRoom("This is a normal room")));
		this.currentRoom.addNearRoom("North", new HiddenExit (new MonsterRoom(new Troll(),"This is a Troll cave")));
		room=this.currentRoom.getNearRooms().get("West");
		room.addNearRoom("North", new NormalExit (new ButtonRoom("This is a button room")));
		room=room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit (new NormalRoom("This is a normal room")));
		room=room.getNearRooms().get("North");
		room.addNearRoom("North", new HiddenExit (new MonsterRoom(new Moskito(),"This is a normal room")));
	}
	
	
}
