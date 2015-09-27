package dungeon;

import java.util.ArrayList;
import java.util.List;

public class Player {
	protected int maxHealth =100;
	protected int healthpoint = maxHealth;
	public static final List<Stuff> inventory = new ArrayList<>();
	public Weapon equipedWeapon ;
	
	
	public List<Stuff> getInventory (){
		return Player.inventory;
	}
	
	public int dammagePlayer(){
		return this.equipedWeapon.getBaseDamage()+
				(int)(Math.random()*(double)this.equipedWeapon.getDamageRange()); 
	}
}
