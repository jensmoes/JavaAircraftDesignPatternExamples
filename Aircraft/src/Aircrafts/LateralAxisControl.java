package Aircrafts;

public class LateralAxisControl {

	public LateralAxisControl() {
		// TODO Auto-generated constructor stub
	}
	
	public void pitch(int deflection){
		mDeflection = deflection;
		System.out.printf("Deflecting pitch control %d degress\n", deflection);
	}
	
	public int mDeflection;

}
