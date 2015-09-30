package dungeon;

import monstres.Monster;
import rooms.MonsterRoom;

public class FightCommand implements InterfaceCommand {
	
	@Override
	public void action(String command, AbstractDungeon dungeon) {
		if (dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().toLowerCase().equals("monsterroom")){
			switch(command){
			case "attack":
				Monster monster = ((MonsterRoom)dungeon.getCurrentRoom()).getMonster();
				Player player = dungeon.getPlayer();
				int dmg = dungeon.getPlayer().damagePlayer();
				
				System.out.println(monster.getName() + " lost " + dmg + " HP !");
				monster.takeDamage(dmg);
				
				dmg=monster.damageMonster();
				System.out.println(monster.getName() + " attacked you ! \nYou lost " + dmg + " HP.");
				player.takeDamage(dmg);
				
				System.out.println("You have " + player.getHealthpoint() + "HP left");
				
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

		dungeon.getCurrentRoom().action(command, dungeon);
	}
}