package carApp;

public class VWGolf extends VW {

	private final static float FUEL_TANK_SIZE = 60f;
	private final static String FUEL_TYPE = "DIESEL";
	private final static int NUMBER_OF_GEARS = 6;
	private final static float CONSUMPTION_KM = 0.059f;//Is calculated as averageFuelConsumption/100km in this case  5.9/100 = 0.059.

	public VWGolf(float availableFuelInTank, String chasseNumber) {
		super(availableFuelInTank, chasseNumber, FUEL_TANK_SIZE, FUEL_TYPE, NUMBER_OF_GEARS, CONSUMPTION_KM);
	}
	
	float calculateFuelKm(int gear){
		float fuelValue;
		switch(gear){
		case 1:
			fuelValue = 0.075f;//Is calculated like CONSUMPTION_KM
			break;
		case 2:
			fuelValue = 0.052f;
			break;
		case 3:
			fuelValue = 0.044f;
			break;
		case 4:
			fuelValue = 0.037f;
			break;
		case 5:
			fuelValue = 0.029f;
			break;
		default:
			fuelValue = 0.01f;//Consumption at idle.
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