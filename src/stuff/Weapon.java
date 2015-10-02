package stuff;

/**
 * Weapon Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public abstract class Weapon extends Stuff  {
	

	/**
	 * Base damage of the weapon
	 */
	protected int baseDamage;
	/**
	 * Bonus damage of the weapon
	 */
	protected int damageRange;
	
	// Methods - Getters and Setters

    /**
     * Getter for the base damage
     * @return base damage
     */
    	public int getBaseDamage(){
		return this.baseDamage;
	}
	
    /**
     * Getter for the damage range
     * @return damage range
     */
    public int getDamageRange(){
		return this.damageRange;
	}

    /**
     * Setter for the base damage
     * @param baseDamage new base damage
     */
    public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

    /**
     * setter for the damage range
     * @param damageRange new damagerange
     */
    public void setDamageRange(int damageRange) {
		this.damageRange = damageRange;
	}
	
        @Override
	public String toString(){
		return  this.getItemName() + ". \n"
				+ "Base damage : " + this.getBaseDamage() + ".\n"
						+ "Damage range : " + this.getDamageRange() + ".\n";
	}

}
