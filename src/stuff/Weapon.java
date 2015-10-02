package stuff;


public abstract class Weapon extends Stuff  {
	
	//Attributes
	/** 
	 * Weapon name
	 */
	protected String wname;
	/**
	 * Base damage of the weapon
	 */
	protected int baseDamage;
	/**
	 * Bonus damage of the weapon
	 */
	protected int damageRange;
	
	// Methods - Getters and Setters
	public int getBaseDamage(){
		return this.baseDamage;
	}
	
	public int getDamageRange(){
		return this.damageRange;
	}

	public String getWeaponName(){
		return this.wname;
	}
	
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public void setDamageRange(int damageRange) {
		this.damageRange = damageRange;
	}
	
	public String toString(){
		return  this.getWeaponName() + ". \n"
				+ "Base damage : " + this.getBaseDamage() + ".\n"
						+ "Damage range : " + this.getDamageRange() + ".\n";
	}

}
