/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Antoine
 */
public class HiddenExit extends ExitDecorator{
    
    public HiddenExit(Room room){
        super.room=room;
    }

    @Override
    public boolean canExit(AbstractDungeon dungeon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void action(String command, AbstractDungeon dungeon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
