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
    	if(this.room.getClass().getSimpleName().equals("ButtonRoom")){
    		return ((ButtonRoom)this.room).isButtonPushed();
    	}else
        return !isHidden;
    }
    
    public void discoverExit(){
    	this.isHidden=false;
    }

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
