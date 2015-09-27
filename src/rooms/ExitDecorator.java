package rooms;


import java.util.Map;

import dungeon.AbstractDungeon;


public abstract class ExitDecorator extends Room {
    protected Room room;
		
    public Room getRoom(){
        return this.room;
    }
    
    @Override
    public String getDescriptionRoom(){
        return this.room.getDescriptionRoom();
    }
                
    @Override
                public void exit(AbstractDungeon dungeon, String command){
                    
                        boolean success=false;
                        for (Map.Entry<String, Room> roomRow : dungeon.getCurrentRoom().getNearRooms().entrySet()){
                            if(roomRow.getKey().toLowerCase().equals(command.toLowerCase())){
                                    if(canExit(dungeon)){
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
                    
                
                public abstract boolean canExit(AbstractDungeon dungeon);
}