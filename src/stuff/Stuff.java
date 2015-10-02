package stuff;

/**
 *
 * @author Antoine
 */
public abstract class Stuff {
	private String itemName;
	
    /**
     *
     * @return
     */
    public String getItemName(){
		return this.itemName;
	}
	
	public abstract String toString();

    /**
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
