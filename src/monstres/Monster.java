package monstres;

/**
 * Monster class (abstract)
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
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
     * Getter for the HP
     * @return HP
     */
    public int getHealthPoint() {
		return healthPoint;
	}

    /**
     * Calculates the damage done forone hit
     * @return damage done
     */
    public int getBaseDamage() {
		return baseDamage;
	}

    /**
     * Getter for the damage range
     * @return damage range
     */
    public int getDamageRange() {
		return damageRange;
	}

    /**
     * Getter for the name
     * @return name
     */
    public String getName() {
		return name;
	}

    /**
     * Hits the monster
     * @param dmg damage taken
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
