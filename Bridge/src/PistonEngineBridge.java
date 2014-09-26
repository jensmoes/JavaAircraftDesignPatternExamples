import Aircrafts.Power.Powerplant;


public class PistonEngineBridge extends PowerplantBridge {

	public PistonEngineBridge(Powerplant aPowerPlantImp) {
		super(aPowerPlantImp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		mEngine.start();
	}

}
