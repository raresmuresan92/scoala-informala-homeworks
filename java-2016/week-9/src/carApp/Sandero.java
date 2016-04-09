package carApp;

public class Sandero extends Dacia{
	
	private final static float FUEL_TANK_SIZE = 55f;
	private final static String FUEL_TYPE = "DIESEL";
	private final static int NUMBER_OF_GEARS = 5;
	private final static float CONSUMPTION_KM = 0.037f;//Is calculated as averageFuelConsumption/100km in this case  3.7/100 = 0.037.

	public Sandero(float availableFuelInTank, String chasseNumber) {
		super(availableFuelInTank, chasseNumber, FUEL_TANK_SIZE, FUEL_TYPE, NUMBER_OF_GEARS, CONSUMPTION_KM);
	}
	
	float calculateFuelKm(int gear){
		float fuelValue;
		switch(gear){
		case 1:
			fuelValue = 0.062f;//Is calculated like CONSUMPTION_KM
			break;
		case 2:
			fuelValue = 0.053f;
			break;
		case 3:
			fuelValue = 0.038f;
			break;
		case 4:
			fuelValue = 0.033f;
			break;
		case 5:
			fuelValue = 0.021f;
			break;
		default:
			fuelValue = 0.08f;//Consumption at idle.
			break;
		}
		return fuelValue;
	}
	
	public float calculateConsumption(double numberOfKm, int gear){
		if(gear != 0){
			float consumption = (float) (calculateFuelKm(this.getCurrentGear()) * numberOfKm);
			return consumption;
		}
		else{
			return (float) (CONSUMPTION_KM * numberOfKm);
		}
	}
}
