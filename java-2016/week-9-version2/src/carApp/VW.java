package carApp;

public abstract class VW extends Car{

	public VW(float availableFuelInTank, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears, float fuelConsumptionKm) {
		super(availableFuelInTank, chasseNumber, fuelTankSize, fuelType, numberOfGears, fuelConsumptionKm);
	}
	
	abstract float calculateConsumption(double numberOfKm, int gear);
	
}