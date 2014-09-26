import Aircrafts.*;


public class DecoratorExample {

	public DecoratorExample() {
		// TODO Auto-generated constructor stub
	}
	
	private static Aircraft mAircraft;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		 mAircraft = new Aircraft();
		 //Concrete gear to be decorated
		 AirplaneLandingGear gear = new AirplaneLandingGear(); 
		 //Create an amphibian airplane
		 mAircraft.setGearComponent(new FloatDecorator(new WheelDecorator(gear)));
		 mAircraft.cycleGear();
	}

}
