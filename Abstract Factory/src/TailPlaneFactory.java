import Aircrafts.Empennage;
import Aircrafts.TailPlaneEmpennage;


public class TailPlaneFactory extends AbstractEmpennageFactory {

	public TailPlaneFactory() {
		// TODO Auto-generated constructor stub
	}

	public Empennage MakeEmpennage(){
		return new TailPlaneEmpennage();
		
	}
}
