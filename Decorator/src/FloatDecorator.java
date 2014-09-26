import Aircrafts.LandingGear;


public class FloatDecorator extends LandingGearDecorator {

	public FloatDecorator(LandingGear aGear) {
		super(aGear);
		// TODO Auto-generated constructor stub
	}

	public void retract(){
		System.out.println("Float not retractable");
		super.retract();
	}
	public void extend(){
		System.out.println("Float not retractable");
		super.extend();
	}

	@Override
	public void brake(boolean engage) {
		//If 2 rudders Turn them opposite
		if(engage)
			System.out.println("Rudders deflecting");
		else
			System.out.println("Rudders resetting");
	}
}
