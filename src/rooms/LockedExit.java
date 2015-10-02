package rooms;

import dungeon.AbstractDungeon;
import stuff.Key;

/**
 *
 * @author 
 */
public class LockedExit extends ExitDecorator{
    
	boolean locked;
	
    /**
     *
     * @param room
     */
    public LockedExit(Room room){
		super.room = room;
		this.locked = true;
	}

    /**
     *
     * @param dungeon
     * @return
     */
    @Override
    public boolean canExit(AbstractDungeon dungeon) {
        if(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().equals("MonsterRoom")){
            return !(((MonsterRoom)dungeon.getCurrentRoom()).getMonster().isAlive());
        }
        else{
            return dungeon.getPlayer().haveObject("key");
        }
    }

}
