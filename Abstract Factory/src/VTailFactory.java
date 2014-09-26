import Aircrafts.Empennage;
import Aircrafts.VTailEmpennage;


public class VTailFactory extends AbstractEmpennageFactory {

	public VTailFactory() {
		// TODO Auto-generated constructor stub
	}
	public Empennage MakeEmpennage(){
		return new VTailEmpennage();
		
	}
}
