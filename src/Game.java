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
	
	public void getUserEntry(String actions){
		System.out.printf(actions);
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
			break;
		case "use":
			break;
		case "take":
			break;
		default:
				
		}
		/*
		for(int i = 0; i < splittedCommand.length ; i++){
		System.out.println(splittedCommand[i]);
		}*/
	}
	
	
	public static void main(String[] args){
		Game game = new Game();
		game.getUserEntry("Quelles actions voulez vous réaliser\n");
	}
}
