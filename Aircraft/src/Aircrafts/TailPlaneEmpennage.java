package Aircrafts;

public class TailPlaneEmpennage extends Empennage {

	public TailPlaneEmpennage() {
		// TODO Auto-generated constructor stub
	}
	public void yaw(int deflection){
		System.out.println("Normal Tailplane Yawing");
		mRudder.yaw(deflection);
	}
	public void pitch(int deflection){
		System.out.println("Normal Tailplane Pitching");
		mElevator.pitch(deflection);
	}
	
	private LateralAxisControl mElevator = new LateralAxisControl();
	private VerticalAxisControl mRudder = new VerticalAxisControl();
	
	public void addElevator(LateralAxisControl aElevator)
	{
		mElevator = aElevator;
	}
	public void addRudder(VerticalAxisControl aRudder){
		mRudder = aRudder;
	}

}
