package rooms;
import dungeon.AbstractDungeon;

public class HiddenExit extends ExitDecorator{
    private boolean isHidden;
    
    public HiddenExit(Room room){
        super.room=room;
        isHidden=true;
    }

    @Override
    public boolean canExit(AbstractDungeon dungeon) {
    	if(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().equals("ButtonRoom")){
    		return (((ButtonRoom)dungeon.getCurrentRoom().getRoom()).isButtonPushed());
    	}else
    		return !isHidden;
    }
    
    public void discoverExit(){
    	this.isHidden=false;
    }
    
}
