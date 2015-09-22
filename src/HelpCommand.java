
public class HelpCommand implements InterfaceCommand{

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		switch(command){
		case "commands":
			System.out.println("");
			break;
		case "here":
			
			break;
		default :
			System.out.println("Wrong argument");
		}
		
	}
	
}
