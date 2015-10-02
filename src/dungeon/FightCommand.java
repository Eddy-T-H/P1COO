package dungeon;

import java.util.Random;
import java.util.Scanner;

import monstres.Monster;
import rooms.MonsterRoom;
import stuff.Stuff;

public class FightCommand implements InterfaceCommand {

	Scanner sc = new Scanner(System.in);

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

				break;
			case "use":
				if (player.emptyInventory()) {
					System.out.println("You have no item !\n");
					break;
				}
				player.printInventory();
				System.out.println("which item do you to use?");
				command1 = sc.nextLine();
				Stuff item = player.getItemFromInventoryFromString(command1);

				if (item == null) {
					System.out.println("you don't have this item");
					break;
				}
				item = player.getItemFromInventoryFromString(command1);
				player.useItem(item);

				break;
			case "flee":

				Random rm = new Random();
				int dir = rm.nextInt(4);

				if (dir == 0) {

				} else if (dir == 1) {

				} else if (dir == 2l) {

				} else{

				}

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