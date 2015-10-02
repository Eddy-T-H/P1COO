package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import stuff.Fists;
import stuff.HealingPotion;
import stuff.SharpeningPotion;
import stuff.Stuff;
import stuff.Weapon;

/**
 * Player class
 * Represents the player in the game
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class Player {
	
	//Attributes

    /**
     * Maximum HP of the player
     */
    	protected int maxHealth =100;

    /**
     * Current HP of the player
     */
    protected int healthpoint = maxHealth;

    /**
     * Player's inventory
     */
    public List<Stuff> inventory = new ArrayList<>();

    /**
     * Equipped Weapon by the players
     */
    public Weapon equipedWeapon ;
	
	// Builder
	
    /**
     * Player Builder
     */
    	
	public Player(){
		this.setEquipedWeapon(new Fists());
	}
	
	//Methods

    /**
     * Getter for maxHealth
     * @return maxHealth
     */
    	public int getMaxHealth() {
		return maxHealth;
	}

    /**
     * Setter for maxHealth
     * @param maxHealth
     */
    public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

    /**
     * Getter for healthPoint
     * @return healthPoint
     */
    public int getHealthpoint() {
		return healthpoint;
	}

    /**
     * Setter for healthPoint
     * @param healthpoint
     */
    public void setHealthpoint(int healthpoint) {
		this.healthpoint = healthpoint;
	}

    /**
     * Getter for the current equipped weapons
     * @return equipedWeapon
     */
    public Weapon getEquipedWeapon() {
		return equipedWeapon;
	}

    /**
     * Setter for the equipedWeapon
     * @param equipedWeapon new Weapon
     */
    public void setEquipedWeapon(Weapon equipedWeapon) {
		this.equipedWeapon = equipedWeapon;
	}

    /**
     * Getter for the inventory
     * @return inventory
     */
    public List<Stuff> getInventory (){
		return this.inventory;
	}
        
    /**
     * Adds an item to the inventory
     * @param object added
     */
    public void addObject(Stuff object){
	    this.getInventory().add(object);
	}

    /**
     * Void function that prints the content of the player's inventory
     */
    public void printInventory(){
		for(Stuff f:inventory){
			if(f != null){
				System.out.println(f.toString() + "\n");
			}
		}
	}
	
    /**
     * Function that checks if an item is currently in the player's inventory
     * @param nameObject item name to be checked
     * @return true or false
     */
    public boolean haveObject(String nameObject) {
		if (!(inventory.isEmpty())) {
			for (Stuff object : inventory) {
				if ((object.getClass().getSimpleName().toLowerCase()).equals(nameObject)) {
					return true;
				}
			}
			return false;
		} else {
			return false;
		}
	}

    /**
     * Getter for an item in the inventory
     * @param nameObject name of the item
     * @return item or null
     */
    public Stuff getItemFromInventoryFromString(String nameObject) {
		if (!(inventory.isEmpty())) {
			for (Stuff object : inventory) {
				if ((object.getClass().getSimpleName().toLowerCase()).equals(nameObject)) {
					return object;
				}
			}
			return null;
		} else {
			return null;
		}
	}
	
    /**
     * Calculates the damage done for a hit
     * @return Damage done
     */
    public int damagePlayer(){
		return this.getEquipedWeapon().getBaseDamage()+
				(int)(Math.random()*(double)this.getEquipedWeapon().getDamageRange()); 
	}
	
    /**
     * Hurts the player
     * @param dmg Damage that will be done
     */
    public void takeDamage(int dmg){
		if(this.getHealthpoint() - dmg > 0){
			this.setHealthpoint(this.getHealthpoint() - dmg);
		}else{
			this.setHealthpoint(0);
		}
	}
	
    /**
     * Use an healingPotion
     * @param p healingPotion used
     */
    public void useHealingPotion(HealingPotion p){
		if(this.getHealthpoint() + p.getHealingPoints() <= this.getMaxHealth()){
			this.setHealthpoint(this.getMaxHealth() + p.getHealingPoints());
		}else{
			this.setHealthpoint(this.getMaxHealth());
		}
		this.getInventory().remove(p);
	}
	
	/**
	 * Use the sharpening potion on a weapon and improve its abilities by 20%
	 * @param sp sharpeningpotion used
	 * @param w weapon improved
	 */
	public void useSharpeningPotion(SharpeningPotion sp, Weapon w){
		sp.effectOnWeapon(w);
	}
	
    /**
     * Check if the player dead
     * @return true or false
     */
    public boolean isDead(){
		if(this.getHealthpoint() <= 0){
			return true;
		}else{
			return false;
		}
	}
	
    /**
     * Equips a new weapon and places the currently equiped in the inventory
     * @param newWeapon new weapon !
     */
    public void equipWeapon(Weapon newWeapon ){
		if(!(this.getEquipedWeapon() instanceof Fists))
		{	
			addObject(this.getEquipedWeapon());	
		}
		this.setEquipedWeapon(newWeapon);
	}
	
    /**
     * Check if the inventory is empty
     * @return true or false
     */
    public boolean emptyInventory(){
		for(Stuff f:inventory){
			if(f != null){
				return false;
			}
		}
		return true;
	}
	
    /**
     * Makes the player use an item the correct way
     * @param item
     */
    public void useItem(Stuff item){
		if (item instanceof Weapon){
			this.equipWeapon((Weapon)item);
		}else if(item instanceof HealingPotion){
			this.useHealingPotion((HealingPotion)item);
		}		
	}
	
    /**
     * Asks the user which item to use and use it
     */
    public void use(){
		if (this.emptyInventory()) {
			System.out.println("You have no item !\n");
			
		}else{
			this.printInventory();
			System.out.println("which item do you to use?");
			@SuppressWarnings("resource")
			String command1 = (new Scanner(System.in)).nextLine();
			Stuff item = this.getItemFromInventoryFromString(command1);

			if (item == null) {
				System.out.println("you don't have this item");
			}else{
				item = this.getItemFromInventoryFromString(command1);
				System.out.println("Item used : " + item.getItemName());
				this.useItem(item);
			}
		}
	}
	
}
