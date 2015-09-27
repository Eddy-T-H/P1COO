
/*import java.util.ArrayList;
import java.util.List;*/


public class MonsterRoom extends Room {
    /*private List<Monster> monstres = new ArrayList<>();*/
    private Monster monster;
    
    public MonsterRoom(Monster monster,String description){
        this.monster=monster;
        super.setDescriptionRoom(description);
    }

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		
	}
}
