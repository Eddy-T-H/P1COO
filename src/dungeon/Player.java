package dungeon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import stuff.Fists;
import stuff.HealingPotion;
import stuff.SharpeningPotion;
import stuff.Stuff;
import stuff.Weapon;

public class Player {
	
	//Attributes
	protected int maxHealth =100;
	protected int healthpoint = maxHealth;
	public List<Stuff> inventory = new ArrayList<>();
	public Weapon equipedWeapon ;
	
	// Builder
	
	public Player(){
		this.setEquipedWeapon(new Fists());
	}
	
	//Methods
	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	public int getHealthpoint() {
		return healthpoint;
	}

	public void setHealthpoint(int healthpoint) {
		this.healthpoint = healthpoint;
	}

	public Weapon getEquipedWeapon() {
		return equipedWeapon;
	}

	public void setEquipedWeapon(Weapon equipedWeapon) {
		this.equipedWeapon = equipedWeapon;
	}

	public List<Stuff> getInventory (){
		return this.inventory;
	}
        
	public void addObject(Stuff object){
	    this.getInventory().add(object);
	}

	public void printInventory(){
		for(Stuff f:inventory){
			if(f != null){
				System.out.println(f.toString() + "\n");
			}
		}
	}
	
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
	
	public int damagePlayer(){
		return this.getEquipedWeapon().getBaseDamage()+
				(int)(Math.random()*(double)this.getEquipedWeapon().getDamageRange()); 
	}
	
	public void takeDamage(int dmg){
		if(this.getHealthpoint() - dmg > 0){
			this.setHealthpoint(this.getHealthpoint() - dmg);
		}else{
			this.setHealthpoint(0);
		}
	}
	
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
	
	public boolean isDead(){
		if(this.getHealthpoint() <= 0){
			return true;
		}else{
			return false;
		}
	}
	
	public void equipWeapon(Weapon newWeapon ){
		if(!(this.getEquipedWeapon() instanceof Fists))
		{	
			addObject(this.getEquipedWeapon());	
		}
		this.setEquipedWeapon(newWeapon);
	}
	
	public boolean emptyInventory(){
		for(Stuff f:inventory){
			if(f != null){
				return true;
			}
		}
		return true;
	}
	
	public void useItem(Stuff item){
		if (item instanceof Weapon){
			this.equipWeapon((Weapon)item);
		}else if(item instanceof HealingPotion){
			this.useHealingPotion((HealingPotion)item);
		}		
	}
	
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
				this.useItem(item);
			}
		}
	}
	
}
