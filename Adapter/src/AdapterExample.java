import Aircrafts.Aircraft;
import Aircrafts.AirplaneLandingGear;
import Aircrafts.Power.TurboJet;


public class AdapterExample {

	public AdapterExample() {
		// TODO Auto-generated constructor stub
	}
	private static Aircraft mAircraft;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Use existing decorator to create aircraft landing gear 
		mAircraft = new Aircraft();
		 //Concrete gear to be decorated
		 AirplaneLandingGear gear = new AirplaneLandingGear(); 
		 //Create an land airplane gear
		 mAircraft.setGearComponent(new WheelDecorator(gear));
		 
		 //Stop using wheels
		 mAircraft.stop(null);

		 //Aircraft is the client, landing gear is the target
		 //Adapter:
		 ThrustReverserAdapter mAdapter = new ThrustReverserAdapter(new TurboJet());
		 //Stop using wheels and auxiliary braking device
		 mAircraft.stop(mAdapter);
	}

}
