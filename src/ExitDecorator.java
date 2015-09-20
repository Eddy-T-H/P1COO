
public abstract class ExitDecorator extends Room {
		protected Room room;
		
		public Room getRoom(){
			return this.room;
		}
		
		public abstract void exit();
}
