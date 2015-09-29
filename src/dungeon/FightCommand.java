package dungeon;


public class FightCommand implements InterfaceCommand {

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		dungeon.getCurrentRoom().action(command, dungeon);
	}

}
