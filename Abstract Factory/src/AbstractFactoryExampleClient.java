import Aircrafts.Empennage;


public class AbstractFactoryExampleClient {

	public AbstractFactoryExampleClient() {
		// TODO Auto-generated constructor stub
	}

	//Example client creator method that knows nothing about what kind of empennage it is making 
	public static Empennage createEmpennage(AbstractEmpennageFactory factory)
	{
		Empennage mTail = factory.MakeEmpennage();
		//Add other stuff to it like stickers and antennaes etc. that you want on your airplane
		return mTail;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractEmpennageFactory factory = new VTailFactory();
		//You can now decide which type of factory to pass to your client based on whatever criteria needed
		//The client can then create the Empennage when needed and access the pitch and yaw commands independently of the type of tail
		//Build a vTail
		Empennage tail = createEmpennage(factory);
		//Now you can attach it to the fuselage, this can be done with the builder pattern
		tail.yaw(10);
		tail.pitch(3);

		//Build a normal tailplane
		tail = createEmpennage(new TailPlaneFactory());
		tail.yaw(4);
		tail.pitch(7);

	}

}
