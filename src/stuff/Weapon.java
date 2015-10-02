package stuff;

/**
 *
 * @author Antoine
 */
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

    /**
     *
     * @return
     */
    	public int getBaseDamage(){
		return this.baseDamage;
	}
	
    /**
     *
     * @return
     */
    public int getDamageRange(){
		return this.damageRange;
	}

    /**
     *
     * @param baseDamage
     */
    public void setBaseDamage(int baseDamage) {
		this.baseDamage = baseDamage;
	}

    /**
     *
     * @param damageRange
     */
    public void setDamageRange(int damageRange) {
		this.damageRange = damageRange;
	}
	
	public String toString(){
		return  this.getItemName() + ". \n"
				+ "Base damage : " + this.getBaseDamage() + ".\n"
						+ "Damage range : " + this.getDamageRange() + ".\n";
	}

}
