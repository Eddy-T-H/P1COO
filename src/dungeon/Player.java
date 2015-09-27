package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Player {
	protected int maxHealth =100;
	protected int healthpoint = maxHealth;
	public List<Stuff> inventory = new ArrayList<>();
	public Weapon equipedWeapon ;
	
	
	public List<Stuff> getInventory (){
		return this.inventory;
	}
        
        public void addObject(Stuff object){
            this.inventory.add(object);
        }
	
	public int dammagePlayer(){
		return this.equipedWeapon.getBaseDamage()+
				(int)(Math.random()*(double)this.equipedWeapon.getDamageRange()); 
	}
}
