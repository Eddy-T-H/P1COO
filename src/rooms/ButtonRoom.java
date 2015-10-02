package rooms;
import dungeon.AbstractDungeon;

/**
 *	ButtonRoom Class
 * Room with a Button
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ButtonRoom extends Room {
	
	/**
	 * Boolean : state of the button
	 */
	private boolean pushedButton=false;
	/**
	 * Boolean : set the visibility of the button
	 */
	private boolean seeButton =true;
	
    /**
     *	Builder
     * @param description of the room
     */
    public ButtonRoom(String description){
		super.setDescriptionRoom(description);
	}
	
    /**
     * Proceed with an user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    public void action(String command, AbstractDungeon dungeon) {
		if(seeButton){
			System.out.println("You pushed the button and discovered a new door!");
			this.pushedButton=true;
		}
	}

    /**
     *	Check the state of the button
     * @return true if pushed
     */
    public boolean isButtonPushed(){
		return this.pushedButton;
	}

}
