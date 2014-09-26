import Aircrafts.Power.Powerplant;


public class JetEngineBridge extends PowerplantBridge {

	public JetEngineBridge(Powerplant aPowerPlantImp) {
		super(aPowerPlantImp);
		// TODO Auto-generated constructor stub
	}

//	public JetEngineBridge() {
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void start() {
		mEngine.start();
	}

}
