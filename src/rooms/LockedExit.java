package rooms;

import dungeon.AbstractDungeon;
import stuff.Key;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class LockedExit extends ExitDecorator{
    
	boolean locked;
	
    /**
     *Builder
     * @param room
     */
    public LockedExit(Room room){
		super.room = room;
		this.locked = true;
	}

    /**
     * Test if the exit has been unlocked and can be leaved
     * @param dungeon current dungeon
     * @return true or false
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
