
public abstract class Room {
	private String description;

	protected void setDescription (String description){
		this.description=description;
	}
	
	public String getDescription(){
		System.out.println(this.description);
		return this.description;
	}
	
	abstract public void action(String command);
	public void exit(){}
}
