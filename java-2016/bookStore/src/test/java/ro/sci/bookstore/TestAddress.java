package ro.sci.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestAddress {
	
	//declare Address
	List<Address> address = null;
	
	@Before
	public void intAddress() {
		// int address
		address = new ArrayList<Address>();
		address.add(addNewAddress("Aleea Retezat", 5, "Cluj-Napoca"));
		System.out.println("A new address was added.");
	}
	

	@Test
	public void testAddressListSize() {
		assertNotNull(address);
		assertTrue(address.size() > 0);
	}
	
	@Test
	public void testAddressListContent() {
		Address firstAddress = address.get(0);
		
		assertEquals("Aleea Retezat", firstAddress.getStreetName());
	}
	
	private Address addNewAddress(String streetName, int streetNumber, String cityName){
		Address newAddress = new Address();
		newAddress.setStreetName(streetName);
		newAddress.setStreetNumber(streetNumber);
		newAddress.setCityName(cityName);
		
		return newAddress;
	}
	

}



		

