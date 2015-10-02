package rooms;


import java.util.Map;

import dungeon.AbstractDungeon;

/**
 *
 * @author 
 */
public abstract class ExitDecorator extends Room {

    /**
     *
     */
    protected Room room;
		
    /**
     *
     * @return
     */
    public Room getRoom(){
        return this.room;
    }
    
    /**
     *
     * @return
     */
    @Override
    public String getDescriptionRoom(){
        return this.room.getDescriptionRoom();
    }
                
    /**
     *
     * @param dungeon
     * @param command
     */
    @Override
                public void exit(AbstractDungeon dungeon, String command){
                        boolean success=false;
                        for (Map.Entry<String, Room> roomRow : dungeon.getCurrentRoom().getNearRooms().entrySet()){
                            if(roomRow.getKey().toLowerCase().equals(command.toLowerCase())){
                                    if(((ExitDecorator)roomRow.getValue()).canExit(dungeon)){
                                    dungeon.setCurrentRoom(roomRow.getValue());
                                    System.out.println("You change of room");
                                    success = true;
                                    }
                            }
                        }
                        if(!success){
                            System.out.println("You can't move that way");
                        }
            }
                    
    /**
     *
     * @param dungeon
     * @return
     */
    public abstract boolean canExit(AbstractDungeon dungeon);
                
    /**
     *
     * @param command
     * @param dungeon
     */
    @Override
      public void action(String command, AbstractDungeon dungeon) {
    	  room.action(command, dungeon);
      }
}