package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author 
 */
public class HiddenExit extends ExitDecorator{
    private boolean isHidden;
    
    /**
     *
     * @param room
     */
    public HiddenExit(Room room){
        super.room=room;
        isHidden=true;
    }

    /**
     *
     * @param dungeon
     * @return
     */
    @Override
    public boolean canExit(AbstractDungeon dungeon) {
    	if(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().equals("ButtonRoom")){
    		return (((ButtonRoom)dungeon.getCurrentRoom().getRoom()).isButtonPushed());
    	}else
    		return !isHidden;
    }
    
    /**
     *
     */
    public void discoverExit(){
    	this.isHidden=false;
    }
    
}
