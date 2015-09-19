import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
	//Attributes 
	private String userEntry;
	private final Scanner scanEntry = new Scanner(System.in);
	private List<AbstractDungeon> dungeons;
	//private List<Stuff> stuff;
	
	//Methods
	public Game(){
		this.dungeons = new ArrayList<>();
		this.dungeons.add(new ConcreteDungeon());
	}
	
	public void start(){
		this.dungeons.get(0);
	}
	
	public void getUserEntry(String instruction){
		System.out.printf(instruction);
		userEntry = scanEntry.nextLine();
		this.interpretCommand();
	}
	
	public void interpretCommand(){
		String[] splittedCommand;
		splittedCommand = userEntry.split(" ",200);
		switch (splittedCommand[0]){
		case "go":
			(new FightCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		case "get":
			(new DescriptionCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		case "push":
			(new ButtonCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		case "take":
			(new ObjectCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		case "use":
			(new ObjectCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		case "move":
			(new ObjectCommand()).action(splittedCommand[1], this.dungeons.get(0));
			break;
		default:
			System.out.println("Unrecognized command");
		}
	}
	
	
	public static void main(String[] args){
		Game game = new Game();
		game.getUserEntry("Quelle action voulez vous réaliser\n");
	}
}
