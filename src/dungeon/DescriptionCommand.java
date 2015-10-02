package dungeon;
public class DescriptionCommand implements InterfaceCommand {
	
	@Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
			case "description room":
				System.out.println(dungeon.getCurrentRoom().getDescriptionRoom());
				if (dungeon.roomHasHiddenExit()){
					System.out.println("You found a strange print.");
				}
				if(dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().equals("ButtonRoom")){
					System.out.println("You saw a strange button!");
				}
				else{
					System.out.println("You touched the print and found a new exit!");
				}
				break;
			case "description around":
				System.out.println(dungeon.getCurrentRoom().getDescriptionAround());
				break;
			default:
				System.out.println("Entity unrecognized");				
		}
		
	}
}
