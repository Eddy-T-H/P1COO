package rooms;

import dungeon.AbstractDungeon;
import stuff.Key;

public class LockedExit extends ExitDecorator{
    
	boolean locked;
	
    public LockedExit(Room room){
		super.room = room;
		this.locked = true;
	}

    @Override
    public boolean canExit(AbstractDungeon dungeon) {
        if(dungeon.getCurrentRoom().getClass().getSimpleName().equals("MonsterRoom")){
            return !(((MonsterRoom)dungeon.getCurrentRoom()).getMonster().isAlive());
        }
        else{
            return dungeon.getPlayer().haveObject("key");
        }
    }

    /*public void unlockWithKey(Key k){
    	if(k.getRoom()==this){
    		this.locked = false;
    	}
    }
    */
}
