package dungeon;

import java.util.ArrayList;
import java.util.List;

import stuff.Stuff;
import stuff.Weapon;

public class Player {
	
	//Attributes
	protected int maxHealth =100;
	protected int healthpoint = maxHealth;
	public List<Stuff> inventory = new ArrayList<>();
	public Weapon equipedWeapon ;
	
	
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
	    this.inventory.add(object);
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

	public int damagePlayer(){
		return this.equipedWeapon.getBaseDamage()+
				(int)(Math.random()*(double)this.equipedWeapon.getDamageRange()); 
	}
	
	public void takeDamage(int dmg){
		this.healthpoint=this.healthpoint-dmg;
	}
	
	public void heal(int points){
		if(this.getHealthpoint() + points <= this.getMaxHealth()){
			this.setHealthpoint(this.getMaxHealth() + points);
		}else{
			this.setHealthpoint(this.getMaxHealth());
		}
	}
	
}
