package Aircrafts;


public class Aircraft {

	private LandingGear mGear;
	private Empennage mTail;
	
	public void setGearComponent(LandingGear aGear) {
		mGear = aGear;
	}
	public void cycleGear(){
		if(mGear != null)
		{
			mGear.extend();
			mGear.retract();			
		}
	}
	public void stop(LandingGear aGear)
	{
		//Slightly contrived case
		//Stop aircraft using existing plus any auxillary braking system, used to show Adapter example
		if(mGear != null)
			mGear.brake(true);
		if(aGear != null)
			aGear.brake(true);
		//Wait till we are stationary...
		if(mGear != null)
			mGear.brake(false);
		if(aGear != null)
		aGear.brake(false);
	}
}
