package stuff;

import rooms.LockedExit;

public class Key extends Stuff {

	/**
	 * LockedExit that can be opened by this key
	 */
	private LockedExit room;

	// Constructor
	public Key(LockedExit exit){
		this.room = exit;
	}

	
	/**
	 * Getter
	 * @return LockedExit that can be opened by this key
	 */
	public LockedExit getRoom() {
		return room;
	}
	
	/**
	 * Test if exit can be opened by the key
	 * @param exit LockedRoom tested
	 * @return boolean
	 */
	public boolean canUnlock(LockedExit exit){
		return this.getRoom()==exit;
	}
	/*
	public void unLock(LockedExit exit){
		if (this.canUnlock(exit))
			exit.unlockWithKey(this);
	}
	*/
}
