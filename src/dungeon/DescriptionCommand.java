package dungeon;
public class DescriptionCommand implements InterfaceCommand {
	
	@Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
			case "description room":
				System.out.println(dungeon.getCurrentRoom().getDescriptionRoom());
				break;
			case "description around":
				System.out.println(dungeon.getCurrentRoom().getDescriptionAround());
				break;
			default:
				System.out.println("Entity unrecognized");				
		}
		
	}
}
