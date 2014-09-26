import Aircrafts.LandingGear;
import Aircrafts.Power.TurboJet;


public class ThrustReverserAdapter extends LandingGear {
	
	TurboJet jetEngine;

	public ThrustReverserAdapter(TurboJet engine) {
		jetEngine = engine;
	}

	@Override
	public void retract() {
		// TODO Auto-generated method stub

	}

	@Override
	public void extend() {
		// TODO Auto-generated method stub

	}

	@Override
	public void brake(boolean engage) {
		if(engage)
			jetEngine.mThrustReverser.engage();
		else
			jetEngine.mThrustReverser.disengage();

	}

}
