package rooms;
import dungeon.AbstractDungeon;


public class ButtonRoom extends Room {
	private boolean pushedButton=false;
	private boolean seeButton =true;
	
	public ButtonRoom(String description){
		super.setDescriptionRoom(description);
	}
	
	public void action(String command, AbstractDungeon dungeon) {
		if(seeButton){
			System.out.println("");
			this.pushedButton=true;
		}
	}
	public boolean isButtonPushed(){
		return this.pushedButton;
	}

}
