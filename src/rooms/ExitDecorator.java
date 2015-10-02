package rooms;


import java.util.Map;

import dungeon.AbstractDungeon;

/**
 * Exit Decorator
 * Uses the decorated pattern to link rooms through exits
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public abstract class ExitDecorator extends Room {

    /**
     * Attribute room
     */
    protected Room room;
		
    /**
     * Getter for Room
     * @return room
     */
    public Room getRoom(){
        return this.room;
    }
    
    /**
     * Getter for description room
     * @return description room
     */
    @Override
    public String getDescriptionRoom(){
        return this.room.getDescriptionRoom();
    }
                
	/**
	 * Method exit used to leave a room
	 * 
	 * @param dungeon
	 *            current dungeon
	 * @param command
	 *            user command
	 */
	@Override
	public void exit(AbstractDungeon dungeon, String command) {
		boolean success = false;
		for (Map.Entry<String, Room> roomRow : dungeon.getCurrentRoom().getNearRooms().entrySet()) {
			if (roomRow.getKey().toLowerCase().equals(command.toLowerCase())) {
				if (((ExitDecorator) roomRow.getValue()).canExit(dungeon)) {
					dungeon.setCurrentRoom(roomRow.getValue());
					if (roomRow.getValue().getRoom().isAnEndRoom()) {
						System.out.println("Won !");
						dungeon.gameFinished();
					}
					System.out.println("You change of room");
					success = true;
				}
			}
		}
		if (!success) {
			System.out.println("You can't move that way");
		}
	}
                    
    /**
     *	Test if room can be leaved
     * @param dungeon current dungeon
     * @return true if room can be leaved
     */
    public abstract boolean canExit(AbstractDungeon dungeon);
                
    /**
     * Proceed with the user entry
     * @param command user entry
     * @param dungeon current dungeon
     */
    @Override
      public void action(String command, AbstractDungeon dungeon) {
    	  room.action(command, dungeon);
      }
}