package monstres;

/**
 *	Goblin Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class Goblin extends Monster{

	// Goblin constructor

    /**
     * Create a new Goblin
     */
    	public Goblin(){
		super.name="Goblin";
		super.healthPoint=30;
		super.baseDamage=5;
		super.damageRange=3;
	}
    
}
