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
        return !isHidden;
    }
    
    @Override
    public String getDescriptionRoom(){
        isHidden=false;
        return this.room.getDescriptionRoom() + "You discovered a hidden exit";
    }

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
