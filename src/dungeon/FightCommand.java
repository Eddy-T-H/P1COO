package dungeon;

import java.util.Random;
import java.util.Scanner;

import monstres.Monster;
import rooms.MonsterRoom;
import stuff.Stuff;

/**
 *
 * @author
 */
public class FightCommand implements InterfaceCommand {

	Scanner sc = new Scanner(System.in);

    /**
     *
     * @param command1
     * @param dungeon
     */
    @Override
	public void action(String command1, AbstractDungeon dungeon) {
		if (dungeon.getCurrentRoom().getRoom().getClass().getSimpleName().toLowerCase().equals("monsterroom")) {
			Player player = dungeon.getPlayer();
			switch (command1) {
			case "attack":
				Monster monster = ((MonsterRoom) dungeon.getCurrentRoom().getRoom()).getMonster();
				int dmg = dungeon.getPlayer().damagePlayer();

				System.out.println(monster.getName() + " lost " + dmg + " HP !");
				monster.takeDamage(dmg);

				dmg = monster.damageMonster();
				System.out.println(monster.getName() + " attacked you ! \nYou lost " + dmg + " HP.");
				player.takeDamage(dmg);

				System.out.println("You have " + player.getHealthpoint() + "HP left");
				if(!(monster.isAlive())){
					System.out.println("the"+monster.getName()+" is dead");
				}
				break;
			case "use":
				player.use();
        		break;

			default:
				System.out.println("Entity unrecognized");
			}
		} else {
			System.out.println("You are not in a monsterRoom .");
		}

		dungeon.getCurrentRoom().action(command1, dungeon);
	}
}
