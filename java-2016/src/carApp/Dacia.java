package carApp;

public abstract class Dacia extends Car {

	public Dacia(float availableFuelInTank, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears, float fuelConsumptionKm) {
		super(availableFuelInTank, chasseNumber, fuelTankSize, fuelType, numberOfGears, fuelConsumptionKm);
	}
	
	abstract float calculateConsumption(double numberOfKm, int gear);
	
}
