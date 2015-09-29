package dungeon;

import rooms.MonsterRoom;

public class FightCommand implements InterfaceCommand {
	
	@Override
	public void action(String command, AbstractDungeon dungeon) {
		if (dungeon.getCurrentRoom().getClass().getSimpleName().equals("MonsterRoom")){
			switch(command){
			case "attack":
				int dmg=dungeon.getPlayer().damagePlayer();
				
				System.out.println("you hit for"+dmg+"damage");
				((MonsterRoom)dungeon.getCurrentRoom()).getMonster().takeDamage(dmg);
				
				dmg=((MonsterRoom)dungeon.getCurrentRoom()).getMonster().damageMonster();
				System.out.println("you got hit for"+dmg+"damage");
				dungeon.getPlayer().takeDamage(dmg);
				
				System.out.println("you have "+dungeon.getPlayer().getHealthpoint()+"HealthPoint left");
				
				break;
			case "potion":
				System.out.println("");
				break;
			default:
				System.out.println("Entity unrecognized");				
			}
		}else{
			System.out.println("You are not in a monsterRoom .");
		}
	}
}