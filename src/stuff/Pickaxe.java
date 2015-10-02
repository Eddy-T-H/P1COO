package stuff;

/**
 * Pickaxe Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class Pickaxe extends Weapon {

    /**
     * Builder
     */
    	public Pickaxe(){
		this.baseDamage = 5;
		this.damageRange = 2;
		this.setItemName("Pickaxe");
	}
	
}
