package stuff;

/**
 *
 * @author Antoine Bondin, Eddy Thockler & Hugo Chaumette
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

    /**
     *
     * @param itemName
     */
    public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
