import Aircrafts.LandingGear;


public class SkidDecorator extends LandingGearDecorator {


	public SkidDecorator(LandingGear aGear) {
		super(aGear);
		// TODO Auto-generated constructor stub
	}
	public void retract(){
		System.out.println("Skid not retractable");
		super.retract();
	}
	public void extend(){
		System.out.println("Skid not retractable");
		super.extend();
	}
//	@Override
//	public void brake(boolean engage) {
//		// Do nothing, skid to a halt
//		System.out.println("Skidding to a halt");
//	}
}
