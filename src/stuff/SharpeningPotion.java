package stuff;

public class SharpeningPotion extends Stuff {

	/**
	 * Damage multiplier
	 */
	private double sharpeningPoints;
	
	public SharpeningPotion(){
		this.sharpeningPoints = 1.2;
	}
	
	/**
	 * Use the sharpening potion on a weapon and improve its abilities by 20%
	 * @param w weapon improved
	 */
	public void useSharpeningPotion(Weapon w){
		w.setBaseDamage((int)Math.round(w.getBaseDamage()*this.sharpeningPoints));
		w.setDamageRange((int)Math.round(w.getDamageRange()*this.sharpeningPoints));
	}
	
}
