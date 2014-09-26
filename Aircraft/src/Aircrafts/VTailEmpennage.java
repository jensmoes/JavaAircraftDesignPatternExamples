package Aircrafts;

public class VTailEmpennage extends Empennage {

	public VTailEmpennage() {
		// TODO Auto-generated constructor stub
	}
	public void yaw(int deflection){
		//Some function for yaw using elevators
		System.out.println("Left vTail Yawing");
		mElevatorLeft.pitch(mElevatorLeft.mDeflection += 0.1*deflection);
		System.out.println("Right vTail Yawing");
		mElevatorRight.pitch(mElevatorRight.mDeflection -= 0.1*deflection);
	}
	
	public void pitch(int deflection){
		System.out.println("Left vTail Pitching");
		mElevatorLeft.pitch(deflection);
		System.out.println("Right vTail Pitching");
		mElevatorRight.pitch(deflection);
	}
	
	//This can also be aggregated into a ruddervator class	
	private LateralAxisControl mElevatorLeft = new LateralAxisControl();
	private LateralAxisControl mElevatorRight = new LateralAxisControl();
	
//	public void addElevators(LateralAxisControl aElevatorLeft, LateralAxisControl aElevatorRight)
//	{
//		mElevatorLeft = aElevatorLeft;
//		mElevatorRight = aElevatorRight;
//	}
}
