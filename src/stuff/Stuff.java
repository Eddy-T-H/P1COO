package stuff;

/**
 * Stuff class. 
 * Defines the items
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
 */
public abstract class Stuff {
	private String itemName;
	
    /**
     * Getter for itemName
     * @return item name
     */
    public String getItemName(){
		return this.itemName;
	}

    /**
     * Setter for itemName
     * @param itemName new name
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
