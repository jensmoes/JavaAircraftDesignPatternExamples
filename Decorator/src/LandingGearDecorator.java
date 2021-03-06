import Aircrafts.LandingGear;


public abstract class LandingGearDecorator extends LandingGear {

	public LandingGearDecorator(LandingGear aGear) {
		mComponent = aGear;
	}

	public void retract(){
//		System.out.println("Retracting a gear component");		
		mComponent.retract();
	}
	public void extend(){
//		System.out.println("Extending a gear component");		
		mComponent.extend();
	}
	
	public void brake(boolean engage){
		mComponent.brake(engage);
	}
	private LandingGear mComponent;
}
