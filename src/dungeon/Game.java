package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import rooms.*;

/**
 * Game class
 * Used to launch the game and get the user inputs
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class Game {
	
	
	//Attributes 
	private String userEntry;
	private final Scanner scanEntry = new Scanner(System.in);
	private List<AbstractDungeon> dungeons  = new ArrayList<>();
	private int currentDungeon=0;
	private static Game game; 
	
	
	//Constructor

    /**
     * Builder used to start a game
     */
    	public Game(){
		this.dungeons.add(new ConcreteDungeon());
	}
	
    /**
     * Builder used to start a game with a specified player (for level 2+)
     * @param p player
     */
    public Game(Player p){
		this.dungeons.add(new ConcreteDungeon(p));
	}
	
	
	//Methods

    /**
     * Void method that launch the game
     */
    	public void start(){
		this.dungeons.get(currentDungeon);
	}
	
    /**
     * Method that get an user entry and proceed to the interpretation
     * @param instruction user entry
     */
    public void getUserEntry(String instruction){
		System.out.printf(instruction);
		userEntry = scanEntry.nextLine();
		this.interpretCommand();
	}
	
    /**
     *	Getter for the currentDungeon
     * @return currentDungeon
     */
    public AbstractDungeon getCurrentDungeon(){
		return this.dungeons.get(this.currentDungeon);
	}
	
    /**
     * Getter for the currentRoom
     * @return currentRoom
     */
    public Room getCurrentRoom(){
		return this.getCurrentDungeon().getCurrentRoom().getRoom();
	}
	
    /**
     *	Boolean used to check if the player is stuck in a monsterRoom
     * @return boolean
     */
    public boolean isStuckInMonsterRoom(){
		if(this.getCurrentRoom().getRoom().getClass().getSimpleName().toLowerCase().equals("monsterroom")){
			if(((MonsterRoom)this.getCurrentRoom()).getMonster().isAlive()){
				return true;
			}
		}
		return false;
	}
	
    /**
     * Getter for the player
     * @return player
     */
    public Player getPlayer(){
		return this.getCurrentDungeon().getPlayer();
	}
	
    /**
     * Void method used to launch the game
     */
    public void launchGame(){
        while(this.currentDungeon!=dungeons.size()){
        	 System.out.println("Welcome in the " + this.dungeons.get(currentDungeon).getClass().getSimpleName()  + "!\n"
     				+ "Enter \"help commands\" to get informations on game's commands. \n"
     				+ "Or enter \"help here\" to get commands you can use in your current room.");
			while(!this.dungeons.get(currentDungeon).isFinished()){
				if(this.getPlayer().isDead()){
					System.out.println("You are dead ! Game over.\n");
					Game.game = new Game();
					game.launchGame();
				}
				this.getUserEntry("");
			}
			game=new Game(this.getPlayer());
			game.launchGame();
        }
        System.out.println("EndGame");
	}
	
    /**
     * Void method that asks for a userEntry and starts the proceeding
     */
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
					(new UseCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
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
				case "get":
					(new DescriptionCommand()).action(splittedCommand[1], this.dungeons.get(currentDungeon));
					break;
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
     * @param args
	 */
	public static void main(String[] args){
		game = new Game();
		game.launchGame();
	}
	

	
}
