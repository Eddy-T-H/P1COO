package rooms;

import dungeon.AbstractDungeon;
import stuff.Stuff;

/**
 * TrapRoomclass Room with a Trap
 * 
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class TrapRoom extends Room {
	boolean trapactivated;
	int trap_damage;

	
    /**
     * Builder
     * @param description
     */
    public TrapRoom(String description){
		super.setDescriptionRoom(description);
		this.trap_damage = 25;
		this.trapactivated = true;
	}
    
   
    
	/**
     * Proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    @Override
	public void action(String command, AbstractDungeon dungeon) {

		
		if(trapactivated){
			System.out.println("You fall in a trap ! \n You lost " + this.trap_damage + " HP");
			dungeon.getPlayer().takeDamage(this.trap_damage);
			trapactivated = false;
		}
	}
}
