
public class ObjectCommand implements InterfaceCommand {

	@Override
	public void action(String command, AbstractDungeon dungeon) {
		System.out.println(command);
		dungeon.interpretCommand(command);
	}

}
