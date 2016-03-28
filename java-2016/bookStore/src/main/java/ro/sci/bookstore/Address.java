package ro.sci.bookstore;

public class Address {
	
	private String streetName;
	private int streetNumber;
	private String cityName;
	
	
	//Address constructor
	public Address(String streetName, int streetNumber, String cityName){
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.cityName = cityName;
	}
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


}
