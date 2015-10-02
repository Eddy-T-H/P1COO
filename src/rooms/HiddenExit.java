package rooms;
import dungeon.AbstractDungeon;

/**
 * HiddenExit Class
 * 
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class HiddenExit extends Exit{
    private boolean isHidden;
    
    /**
     *	Builder
     * @param room
     */
    public HiddenExit(Room room){
        super.room=room;
        isHidden=true;
    }

    /**
     * Test if the exit has been discovered and can be leaved
     * @param dungeon current dungeon
     * @return true or false
     */
    @Override
    public boolean canExit(AbstractDungeon dungeon) {
    	if(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().equals("ButtonRoom")){
    		return (((ButtonRoom)dungeon.getCurrentRoom().getRoom()).isButtonPushed());
    	}else
    		return !isHidden;
    }
    
    /**
     * Set the exit to discovered
     */
    public void discoverExit(){
    	this.isHidden=false;
    }
    
}
