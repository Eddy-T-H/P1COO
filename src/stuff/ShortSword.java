package stuff;

/**
 * Short Sword Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class ShortSword extends Weapon {

    /**
     * Builder
     */
    	public ShortSword(){
		this.baseDamage = 10;
		this.damageRange = 5;
		this.setItemName("Short Sword");
	}
	
}
