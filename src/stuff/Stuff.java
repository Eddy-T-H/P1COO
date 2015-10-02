package stuff;

public abstract class Stuff {
	private String itemName;
	
	public String getItemName(){
		return this.itemName;
	}
	
	public abstract String toString();

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
