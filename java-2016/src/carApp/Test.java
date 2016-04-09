package carApp;

public class Test {

	public static void main(String[] args) {
		//Car car = new Car(); // Car should be a base class.

		int currentFuelAmmount = 27;

		String chasseNumber = "oiqe0934hkkadsn";

		//Car car = new Dacia(currentFuelAmmount, chasseNumber); // This should not be allowed! If I want to create a Dacia car, I will need to create an instance of a model.

		Car car = new Logan(currentFuelAmmount, chasseNumber); // Logan can extend from Dacia, while Dacia extends from Car

		car.start();

		car.shiftGear(1);

		car.drive(0.01);// drives 0.01 KMs

		car.shiftGear(2);

		car.drive(0.02);

		car.shiftGear(3);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(5);

		car.drive(10);

		car.shiftGear(4);

		car.drive(0.5);

		car.shiftGear(3);

		car.drive(0.1);

		car.stop();

	
		float availableFuel = car.getAvailableFuel();
		System.out.println(availableFuel);

		
		float fuelConsumedPer100Km = car.getAverageFuelConsumption();
		System.out.println(fuelConsumedPer100Km);
		
		Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); //available fuel and chassis number

		vehicle.start();

		vehicle.drive(1);

		vehicle.stop();

		Car car2 = (Car) vehicle;

	
		float availableFuel2 = car2.getAvailableFuel();
		System.out.println(availableFuel2);

		
		float fuelConsumedPer100Km2 = car2.getAverageFuelConsumption();
		System.out.println(fuelConsumedPer100Km2);

	}

}
