package stuff;


public abstract class Weapon extends Stuff {
	
	protected int baseDamage;
	protected int damageRange;
	
	public int getBaseDamage(){
		return this.baseDamage;
	}
	
	public int getDamageRange(){
		return this.damageRange;
	}

	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public void setDamageRange(int damageRange) {
		this.damageRange = damageRange;
	}
	
	

}
