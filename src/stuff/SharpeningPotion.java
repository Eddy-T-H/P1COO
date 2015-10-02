package stuff;

/**
 *
 * @author Antoine
 */
public class SharpeningPotion extends Stuff {

	/**
	 * Damage multiplier
	 */
	private double sharpeningPoints;
	/**
	 * Potion name
	 */
	private String psname;
	
    /**
     *
     */
    public SharpeningPotion(){
		this.sharpeningPoints = 1.2;
		this.setPsname("Sharpening Potion");
	}
	
    /**
     *
     * @return
     */
    public String getPsname() {
		return psname;
	}

    /**
     *
     * @param psname
     */
    public void setPsname(String psname) {
		this.psname = psname;
	}

    /**
     *
     * @return
     */
    public double getSharpeningPoints() {
		return sharpeningPoints;
	}


	/**
	 * Use the sharpening potion on a weapon and improve its abilities by 20%
	 * @param w weapon improved
	 */
	public void effectOnWeapon(Weapon w){
		w.setBaseDamage((int)Math.round(w.getBaseDamage()*this.getSharpeningPoints()));
		w.setDamageRange((int)Math.round(w.getDamageRange()*this.getSharpeningPoints()));
	}



	@Override
	public String toString() {
			return this.getPsname();
	}
	
}
