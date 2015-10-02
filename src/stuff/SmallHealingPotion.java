package stuff;

/**
 * SmallHealingPotion Class
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public class SmallHealingPotion extends HealingPotion{

    /**
     * Builder
     */
    public SmallHealingPotion(){
		this.setHealingPoints(5);
		this.setItemName("Small Healing Potion");
	}
	
}
