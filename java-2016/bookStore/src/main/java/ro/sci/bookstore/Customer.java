package ro.sci.bookstore;

public class Customer {
	
	private String name;
	private String email;
	private Address address = new Address();
	
	public void setAddress(String streetName) {
		address.setStreetName(streetName);
	}

	public Address getAddress() {
		return address;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
