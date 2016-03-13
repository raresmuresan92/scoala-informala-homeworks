package carApp;

/**
 * 
 * This is an interface, named Vehicle, which has the following behavior:
 * the vehicle can be started.
 * can be driven for a number of kilometers
 * and can be stopped.
 * 
 * Created March, 12, 2016
 * @author raresmuresan92
 *
 */

public interface Vehicle {
	
	public void start();
	public void drive(double numberOfKm);
	public void stop();

}