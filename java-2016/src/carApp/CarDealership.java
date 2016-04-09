package carApp;

import java.util.List;

/**
 * A Car Dealership sells cars to clients.
 * @author raresmuresan92
 *
 */

public class CarDealership {
	
	String dealershipName;
	
	//CarDealership constructor
	public CarDealership(String dealershipName){
		this.dealershipName = dealershipName;
	}
	CarDealership compexit = new CarDealership("Compexit");

	List<Car> stock = compexit.listAllCars();

	private List<Car> listAllCars() {
		return null;
	}


}
