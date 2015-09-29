package rooms;
import dungeon.AbstractDungeon;
import monstres.Monster;


/*import java.util.ArrayList;
import java.util.List;*/


public class MonsterRoom extends Room {
    /*private List<Monster> monstres = new ArrayList<>();*/
    private Monster monster;
    
    public MonsterRoom(Monster monster,String description){
        this.monster=monster;
        super.setDescriptionRoom(description);
    }
    
    public Monster getMonster(){
        return this.monster;
    }

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
