package carApp;

/**
 * The Car class is an abstract class that implements Vehicle interface.
 * A car has a fuel tank, a fuel type(Example: Petrol, Diesel, Electric etc.),
 * a number of gears.
 * A car has a predefined consumption of fuel per 100km.
 * Behavior:
 * The gear can be changed.
 * Consumption of fuel.
 * 
 * 
 * @author raresmuresan92
 *
 */

public abstract class Car implements Vehicle {
	
	/*Every car has a chassis number, 
	 * which is unique to it, 
	 * and can not be changed.
	 */
	private String chasseNumber;
	private final float fuelTankSize;//Every car has a fuel tank.
	protected final String fuelType;//Example petrol, diesel, electric.
	protected final int numberOfGears;
	private final float fuelConsumptionKm;
	private float availableFuelInTank;// Liters of fuel availabe in the tank.
	private float currentConsumption;
	private int gear;
	private int currentGear;
	private double currentKm;
	
	/**
	 * Constructor of the Car class.
	 * availabeFuel = Liters of fuel in the tank.
	 * chasseNumber = chassis number which is unique and can not be changed.
	 * fuelTankSize = It depends on the model of car and is unique and can not be changed.
	 * fuelType = It depends on the model of car and is unique and can not be changed.(Example petrol,diesel, electric)
	 * numberOfGears = It depends on the model of car and is unique and can not be changed.(Example 5 , 6 or 1 for electric)
	 * fuelConsumptionKm = It depends on the model of car and is unique and can not be changed.
	 */
	public Car(float availableFuelInTank, String chasseNumber, float fuelTankSize, String fuelType, int numberOfGears, float fuelConsumptionKm) {
		this.availableFuelInTank = availableFuelInTank;
		this.chasseNumber = chasseNumber;
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.numberOfGears = numberOfGears;
		this.fuelConsumptionKm = fuelConsumptionKm;
	}
	
	//Chasse methods
	public void setChasseNumber(String chasseNumber){
		this.chasseNumber = chasseNumber;
	}
	
	public String getchasseNumber(){
		return chasseNumber;
	}
	
	//Gear methods
	public int getGear(){
		return gear;
	}
	
	public void shiftGear(int gear) {
		this.gear = gear;
		System.out.println("You changed in "+this.gear+ " gear.");
	}
	
	public int getCurrentGear(){
		return currentGear;
	}
	
	//Km methods
	public double getCurrentKm(){
		return currentKm;
	}
	
	public void setCurrentKm(double currentKm){
		this.currentKm = currentKm;
 	}
	
	//Consumption methods
	public float getCurrentConsumption(){
		return currentConsumption;
	}
	
	public float getFuelConsumptionKm(){
		return fuelConsumptionKm;
	}
	
	public void setCurrentConsumption(float currentConsumption){
		this.currentConsumption = currentConsumption;
	}
	
	abstract float calculateConsumption(double numberOfKm, int gear);
	
	//Fuel methods
	
	public float getFuelTankSize(){
		return fuelTankSize;
	}
	public float getAvailableFuel(){
		return availableFuelInTank;
	}
	
	public void setAvailabeFuel(float availabeFuel){
		this.availableFuelInTank = availabeFuel;
	}
	
	public String getFuelType(){
		return fuelType;
	}
	
	private void getCurrentFuelLevel(){
		float fuel = availableFuelInTank- getCurrentConsumption();
		setAvailabeFuel(fuel);
		System.out.println("You have " +fuel+ " liters of "+ this.getFuelType()+ " available.");
	}
	
	public float getAverageFuelConsumption() {
		float averageFuelConsumption = (float) (this.getCurrentConsumption() / this.getCurrentKm()*100);
		return averageFuelConsumption;
	}
	
	private void displayAverageFuelConsumption() {
		float averageFuelConsumption = (float) (this.getCurrentConsumption() / this.getCurrentKm()*100);
		System.out.println("Your average consumption is " +averageFuelConsumption+ " liters per hundred of kilometers.");
	}
	
	
	@Override
	public void start(){
		System.out.println(	"The car started and has " + getAvailableFuel() + " liters of " + this.getFuelType()+ " in the tank. \n"+
							"Please fasten seat belt!");
		this.setCurrentConsumption(currentConsumption);
	}
	
	@Override
	public void drive(double numberOfKm){
		float consumption = this.getCurrentConsumption() + calculateConsumption(numberOfKm, this.getCurrentGear());
		this.setCurrentConsumption(consumption);
		double km = this.getCurrentKm() + numberOfKm;
		this.setCurrentKm(km);
	}

	@Override
	public void stop(){
		this.getCurrentFuelLevel();
		this.displayAverageFuelConsumption();
	}
	
}
