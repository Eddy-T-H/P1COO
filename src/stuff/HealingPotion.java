package stuff;

import dungeon.Player;

public abstract class HealingPotion extends Stuff{

	private int healingPoints;
	
	protected void setHealingPoints(int healingPoints) {
		this.healingPoints = healingPoints;
	}

	public int getHealingPoints() {
		return healingPoints;
	}

	public void useHealingPotion(Player p){
		p.heal(this.getHealingPoints());
	}
	
}
