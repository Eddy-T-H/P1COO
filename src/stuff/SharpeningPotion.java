package stuff;

public class SharpeningPotion extends Stuff {

	private double sharpeningPoints;
	
	public SharpeningPotion(){
		this.sharpeningPoints = 1.2;
	}
	
	public void useSharpeningPotion(Weapon w){
		w.setBaseDamage((int)Math.round(w.getBaseDamage()*this.sharpeningPoints));
		w.setDamageRange((int)Math.round(w.getDamageRange()*this.sharpeningPoints));
	}
	
}
