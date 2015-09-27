package rooms;

import dungeon.AbstractDungeon;
public class LockedExit extends ExitDecorator{
    
    public LockedExit(Room room){
		super.room = room;
	}

    @Override
    public boolean canExit(AbstractDungeon dungeon) {
        if(super.room.getClass().getSimpleName().equals("MonsterRoom")){
            return !((MonsterRoom)this.room).getMonster().isAlive();
        }
        else{
            return dungeon.haveObject("key");
        }
    }

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        this.room.action(command, dungeon);
    }
}
