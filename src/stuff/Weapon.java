package stuff;


public abstract class Weapon extends Stuff  {
	
	//Attributes
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

	
	public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

	public void setDamageRange(int damageRange) {
		this.damageRange = damageRange;
	}
	
	public String toString(){
		return  this.getItemName() + ". \n"
				+ "Base damage : " + this.getBaseDamage() + ".\n"
						+ "Damage range : " + this.getDamageRange() + ".\n";
	}

}
