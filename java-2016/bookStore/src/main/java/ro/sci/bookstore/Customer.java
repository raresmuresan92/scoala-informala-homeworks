package ro.sci.bookstore;

public class Customer {
	
	private String name;
	private String email;
	private Address address;
	private Cart cart;
	
	//Customer constructor
	public Customer(String name, String email){
		this.name = name;
		this.email = email;
	}
	
	//Customer constructor with address
	public Customer(String name, Address address){
		this.name = name;
		this.address = address;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}

