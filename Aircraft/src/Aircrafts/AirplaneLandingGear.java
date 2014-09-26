package Aircrafts;

public class AirplaneLandingGear extends LandingGear {

	public AirplaneLandingGear() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retract() {
		// TODO Auto-generated method stub
		gearRetracted = true;
	}

	@Override
	public void extend() {
		// TODO Auto-generated method stub
		gearRetracted = false;
	}
	
	@SuppressWarnings("unused")
	private boolean gearRetracted;

	@Override
	public void brake(boolean engage) {
		// TODO Auto-generated method stub
		
	}

}
