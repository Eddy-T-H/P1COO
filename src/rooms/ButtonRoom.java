package rooms;
import dungeon.AbstractDungeon;

/**
 *
 * @author 
 */
public class ButtonRoom extends Room {
	private boolean pushedButton=false;
	private boolean seeButton =true;
	
    /**
     *
     * @param description
     */
    public ButtonRoom(String description){
		super.setDescriptionRoom(description);
	}
	
    /**
     *
     * @param command
     * @param dungeon
     */
    public void action(String command, AbstractDungeon dungeon) {
		if(seeButton){
			System.out.println("You pushed the button and discovered a new door!");
			this.pushedButton=true;
		}
	}

    /**
     *
     * @return
     */
    public boolean isButtonPushed(){
		return this.pushedButton;
	}

}
