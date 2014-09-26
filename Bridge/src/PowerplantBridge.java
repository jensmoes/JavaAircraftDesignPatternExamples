import Aircrafts.Power.Powerplant;


public abstract class PowerplantBridge {

	Powerplant mEngine;
	
	public PowerplantBridge(Powerplant aPowerPlantImp) {
		mEngine = aPowerPlantImp;
	}
	public abstract void start();

}
