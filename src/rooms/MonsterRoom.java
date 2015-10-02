package rooms;
import dungeon.AbstractDungeon;
import monstres.Monster;


/*import java.util.ArrayList;
import java.util.List;*/

/**
 *
 * @author 
 */



public class MonsterRoom extends Room {
	
    private Monster monster;
    
    /**
     *
     * @param monster
     * @param description
     */
    public MonsterRoom(Monster monster,String description){
        this.monster=monster;
        super.setDescriptionRoom(description);
    }
    
    /**
     *
     * @return
     */
    public Monster getMonster(){
        return this.monster;
    }

    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
