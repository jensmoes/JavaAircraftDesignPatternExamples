import Aircrafts.LandingGear;


public class WheelDecorator extends LandingGearDecorator {

	public WheelDecorator(LandingGear aGear) {
		super(aGear);
		// TODO Auto-generated constructor stub
	}
	public void retract(){
		super.retract();
		System.out.println("Retracting wheel");
	}
	public void extend(){
		super.extend();
		System.out.println("Extending wheel");
	}
	@Override
	public void brake(boolean engage) {
		super.brake(engage);
		if(engage)
			System.out.println("Engaging wheel brake");
		else
			System.out.println("Releasing wheel brake");			
	}

}
