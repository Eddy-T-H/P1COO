package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rooms.*;


public class Game {
	
	
	//Attributes 
	private String userEntry;
	private final Scanner scanEntry = new Scanner(System.in);
	private List<AbstractDungeon> dungeons  = new ArrayList<>();
	private int currentDungeon=0;
	
	
	//Constructor
	public Game(){
		this.dungeons.add(new ConcreteDungeon());
	}
	
	
	//Methods
	public void start(){
		this.dungeons.get(currentDungeon);
	}
	
	public void getUserEntry(String instruction){
		System.out.printf(instruction);
		userEntry = scanEntry.nextLine();
		this.interpretCommand();
	}
	
	public AbstractDungeon getCurrentDungeon(){
		return this.dungeons.get(this.currentDungeon);
	}
	
	public Room getCurrentRoom(){
		return this.getCurrentDungeon().getCurrentRoom();
	}
	
	public boolean isStuckInMonsterRoom(){
		if(this.getCurrentRoom().getClass().getSimpleName().toLowerCase().equals("monsterroom")){
			if(((MonsterRoom)this.getCurrentRoom()).getMonster().isAlive()){
				return true;
			}
		}
		return false;
	}
	
	public void launchGame(){
        while(this.currentDungeon!=dungeons.size()){
        	 System.out.println("Welcome in the " + this.dungeons.get(currentDungeon).getClass().getSimpleName()  + "!\n"
     				+ "Enter \"help commands\" to get informations on game's commands. \n"
     				+ "Or enter \"help here\" to get commands you can use in your current room.");
			while(!this.dungeons.get(currentDungeon).isFinished()){
				this.getUserEntry("");
			}
			currentDungeon++;
        }
	}
	
	public void interpretCommand(){
		String[] splittedCommand;
		splittedCommand = userEntry.split(" ",2);
		if(splittedCommand.length==2){
			if(!this.isStuckInMonsterRoom()){
				switch (splittedCommand[0]){
				case "get":
					(new DescriptionCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "push":
					(new ButtonCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "take":
					(new ObjectCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "use":
					(new ObjectCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "move":
					(new MoveCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "help":
					(new HelpCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				default:
					System.out.println("Unrecognized command");
				}
			}else{
				switch (splittedCommand[0]){
				case "fight":
					(new FightCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				case "help":
					(new HelpCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
				default:
					System.out.println("Unrecognized command -- You can only use the fight command!");
				}
			}
		}
	}
	
	/**
	 * Main function.
	 * Used to launch the game and create a dungeon.
	 */
	public static void main(String[] args){
		Game game = new Game();
		game.launchGame();
	}
	

	
}
