package Aircrafts;

public class VerticalAxisControl {

	public VerticalAxisControl() {
		// TODO Auto-generated constructor stub
	}
	public void yaw(int deflection){
		mDeflection = deflection;
		System.out.printf("Deflecting yaw control %d degress\n", deflection);
	}
	
	public int mDeflection;

}
