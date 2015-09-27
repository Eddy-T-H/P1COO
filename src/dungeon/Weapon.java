package dungeon;


public class Weapon extends Stuff {
	protected int baseDamage;
	protected int damageRange;
	
	public int getBaseDamage(){
		return this.baseDamage;
	}
	
	public int getDamageRange(){
		return this.damageRange;
	}
	
	public String toString(){
		return this.getClass().getName();
	}
}
