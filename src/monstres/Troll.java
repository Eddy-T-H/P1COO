package monstres;

/**
 * Troll Clas
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class Troll extends Monster{	
	
    /**
     * Troll Builder
     */
    	public Troll(){
		super.name="Troll";
		super.healthPoint=60;
		super.baseDamage =10;
		super.damageRange=10;
	}
}
