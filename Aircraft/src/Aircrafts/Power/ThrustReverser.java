package Aircrafts.Power;

public class ThrustReverser {

	public ThrustReverser() {
		// TODO Auto-generated constructor stub
	}

	private boolean mReversing;
	public void engage(){
		mReversing = true;
		System.out.println("Thrustreverser engaged");
	}
	public void disengage(){
		mReversing = false;
		System.out.println("Thrustreverser disengaged");
	}
}
