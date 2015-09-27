package monstres;

public abstract class Monster {
    protected int healthPoint;
    protected int baseDamage;
    protected int damageRange;
    protected String name ;
	
    public boolean isAlive(){
    	if (this.healthPoint <= 0){
    		return false;
    	}else{
    		return true;
    	}
    }
    
    public int damageMonster(){
    	return baseDamage+(int)(Math.random()*(double)damageRange);
    }
    
}
