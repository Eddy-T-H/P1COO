package stuff;

import dungeon.Player;

public abstract class HealingPotion extends Stuff{

	// Attribute
	/**
	 * Amount of HP restored by the potion
	 */
	protected int healingPoints;
	/**
	 * Potion name
	 */
	protected String pname;
	
	
	public String getPname() {
		return pname;
	}

	/**
	 * Setter for healingPoints
	 * @param healingPoints new HealingPoints
	 */
	protected void setHealingPoints(int healingPoints) {
		this.healingPoints = healingPoints;
	}

	/**
	 * Getter for healingPoints
	 * @return current value of healingPoints
	 */
	public int getHealingPoints() {
		return healingPoints;
	}
	
	public String toString(){
		return this.getPname();
	}

	public void setPname(String pname) {
		this.pname = pname;
	}
	
}
