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
    	System.out.println(this.room.getClass().getSimpleName());
    	if(dungeon.getCurrentRoom().getClass().getSimpleName().equals("ButtonRoom")){
    		return (((ButtonRoom)dungeon.getCurrentRoom()).isButtonPushed());
    	}else
    		return !isHidden;
    }
    
    public void discoverExit(){
    	this.isHidden=false;
    }
    
}
