import Aircrafts.*;

//Acting class as Abstract and concrete factory at the same time
public abstract class AbstractEmpennageFactory {

	public AbstractEmpennageFactory() {
		// TODO Auto-generated constructor stub
	}
	public abstract Empennage MakeEmpennage();
	
//	public LateralAxisControl MakeRudder(){
//		return new LateralAxisControl();
//	}
//	public VerticalAxisControl MakeElevator(){
//		return new VerticalAxisControl();
//	}

}
