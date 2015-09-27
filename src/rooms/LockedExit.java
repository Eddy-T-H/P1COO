/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antoine
 */
public class LockedExit extends ExitDecorator{
    
    public LockedExit(Room room){
		super.room = room;
	}

    @Override
    public boolean canExit(AbstractDungeon dungeon) {
        if(super.room.getClass().getName().equals("MonsterRoom")){
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
