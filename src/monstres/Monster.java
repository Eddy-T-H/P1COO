package monstres;

/**
 *
 * @author
 */
public abstract class Monster {
	
	// Attributes
	/**
	 * Health Points of the Monster
	 */
    protected int healthPoint;
    /**
     * Base damage of the monster
     */
    protected int baseDamage;
    /**
     * Bonus damage of the monster
     */
    protected int damageRange;
    /**
     * Name of the monster
     */
    protected String name ;
	
    /**
     *
     * @return
     */
    public int getHealthPoint() {
		return healthPoint;
	}

    /**
     *
     * @return
     */
    public int getBaseDamage() {
		return baseDamage;
	}

    /**
     *
     * @return
     */
    public int getDamageRange() {
		return damageRange;
	}

    /**
     *
     * @return
     */
    public String getName() {
		return name;
	}

    /**
     *
     * @param dmg
     */
    public void takeDamage(int dmg){
		
		this.healthPoint=this.healthPoint-dmg;
		
	}
	/**
     * Test if the monster is alive (hp > 0)
     * @return boolean, true = alive, false = dead
     */
    public boolean isAlive(){
    	if (this.healthPoint <= 0){
    		return false;
    	}else{
    		return true;
    	}
    }
    
    /**
     * Calculates the amount of damage done by the monster
     * Base damage + (0.0 - 1.0) * damage range
     * @return damage done on this call
     */
    public int damageMonster(){
    	return baseDamage+(int)(Math.random()*(double)damageRange);
    }
    
}
