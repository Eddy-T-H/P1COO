package rooms;

import dungeon.AbstractDungeon;
public class LockedExit extends ExitDecorator{
    
    public LockedExit(Room room){
		super.room = room;
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

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        this.room.action(command, dungeon);
    }
}
