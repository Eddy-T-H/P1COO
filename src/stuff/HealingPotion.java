package stuff;

import dungeon.Player;

public abstract class HealingPotion extends Stuff{

	// Attribute
	/**
	 * Amount of HP restored by the potion
	 */
	private int healingPoints;
	
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

	/**
	 * Use of healing potion on a player
	 * @param p Player healed
	 */
	public void useHealingPotion(Player p){
		p.heal(this.getHealingPoints());
	}
	
}
