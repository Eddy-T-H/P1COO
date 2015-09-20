
public class DescriptionCommand implements InterfaceCommand {
	
	@Override
	public void action(String command, AbstractDungeon dungeon) {
		// TODO Auto-generated method stub
		switch(command){
			case "description room":
				System.out.println(dungeon.getCurrentRoom().getDescriptionRoom());
				break;
			case "description around":
				String message;
				message = dungeon.getCurrentRoom().getDescriptionAround();
				if(message == ""){
					System.out.println("Oups it's a kind of a strange issue");
				}
				else{
					System.out.println(message);
				}
				break;
			default:
				System.out.println("Entity unrecognized");				
		}
		
	}
}
