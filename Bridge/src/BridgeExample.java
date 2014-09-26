import Aircrafts.Power.*;

// Non standard naming convention in use:
// Here Abstractions are named *Bridge instead of the concrete classes named *Imp since they reside in the Aircrafts package and are generic examples

public class BridgeExample {

	public BridgeExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//In reality the implementor (PistonEngine) would probably be supplied by a singleton or factory
		PistonEngineBridge pistonEngine = new PistonEngineBridge(new PistonEngine());
		JetEngineBridge jetEngine = new JetEngineBridge(new JetEngine());
		
		//Implementation has now been abstracted from the bridge class
		jetEngine.start();
		pistonEngine.start();
		pistonEngine = new PistonEngineBridge(new LycomingEngine());
		pistonEngine.start();
		
	}

}
