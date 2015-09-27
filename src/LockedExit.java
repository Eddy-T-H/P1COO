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
    public void canExit(AbstractDungeon dungeon, String command) {
        if(this.room.getClass().getName().toLowerCase().equals("monsterroom")){
            if(this.room.getMonster().isAlive()){
                
            }
        }
    }

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        this.room.action(command, dungeon);
    }
}
