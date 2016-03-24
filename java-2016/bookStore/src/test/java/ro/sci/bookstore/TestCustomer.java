package ro.sci.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestCustomer {

	// declare Customer
	List<Customer> customer = null;
	
	@Before
	public void intCustomer() {
		// int customer
		customer = new ArrayList<Customer>();
		customer.add(registerNewCustomer("Rares Muresan", "raresmuresan92@gmail.com", "Aleea Retezat"));
		System.out.println("A new client was registered.");
		
	}
	
	@Test
	public void testCustomerListSize() {
		assertNotNull(customer);
		assertTrue(customer.size() > 0);
	}

	@Test
	public void testCustomerListContent() {
		Customer firstCustomer = customer.get(0);

		assertEquals("Rares Muresan", firstCustomer.getName());
		//assertEquals("Aleea Retezat", firstCustomer.getAddress());

	}
	
	
	private Customer registerNewCustomer(String name, String email, String streetName) {
		Customer newCustomer = new Customer();
		newCustomer.setName(name);
		newCustomer.setEmail(email);
		newCustomer.setAddress(streetName);
		
		return newCustomer;
	}

}

