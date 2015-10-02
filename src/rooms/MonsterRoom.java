package rooms;
import dungeon.AbstractDungeon;
import monstres.Monster;


/*import java.util.ArrayList;
import java.util.List;*/

/** MonsterRoom Class
 * Room with a monster
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */



public class MonsterRoom extends Room {
	
    private Monster monster;
    
    /**
     * Builder
     * @param monster monster to add
     * @param description description of the room
     */
    public MonsterRoom(Monster monster,String description){
        this.monster=monster;
        super.setDescriptionRoom(description);
    }
    
    /**
     * Getter for monster
     * @return Monster
     */
    public Monster getMonster(){
        return this.monster;
    }

    /**
     * UNUSED
     * Proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
