package ro.sci.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCustomer {

	// declare Customer
	List<Customer> customer = null;
	
	List<Stock> stock = null;
	Cart cart;
	CartEntry cartEntry1, cartEntry2;
	
	
	private Address createNewAddress(String streetName, int streetNumber, String cityName){
		Address address = new Address(cityName, streetNumber, cityName);
		address.setStreetName(streetName);
		address.setStreetNumber(streetNumber);
		address.setCityName(cityName);
		
		return address;
	}
	
	private Customer createNewCustomer(String name, Address address, Cart cart, String email){
		Customer customer = new Customer(name, address);
		customer.setCart(cart);
		customer.setEmail(email);
		
		return customer;
	}
	
	private Book createNewBook(String title, String genre, String author, int isbn, double price) {
		Book book = new Book(isbn);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setTitle(title);
		book.setPrice(price);
		book.setWeight(200);

		return book;
	}
	
	private Stock createNewStock(Book book, int quantity){
		Stock stock = new Stock(book, quantity);
		stock.setBook(book);
		stock.setQuantity(quantity);
		
		return stock;
	}
	
	private CartEntry createNewCartEntry(Stock stock, int orderQuantity){
		CartEntry cartEntry = new CartEntry(stock, orderQuantity);
		cartEntry.setStock(stock);
		cartEntry.setOrderQuantity(orderQuantity);
		
		return cartEntry;
	}
	
	
	@Before
	public void intCustomer(){
		
		//int customer
		customer = new ArrayList<Customer>();
		//int stock
		stock = new ArrayList<Stock>();
		
		Address address1 = createNewAddress("Aleea Retezat", 5, "Cluj-Napoca");
		cart = new Cart();
		Customer customer1 = createNewCustomer("Rares Muresan", address1, cart, "raresmuresan92@gmail.com");
		customer.add(customer1);
		
		Book book1 = createNewBook("Absolution", "fiction", "Caro Ramsay", 978-1405909341, 6.99);
		Book book2 = createNewBook("Keep The Midnight Out", "Mystery", "Alex Gray", 978-075155, 4.00);
		
		Stock stock1 = createNewStock(book1, 5);
		stock.add(stock1);
		Stock stock2 = createNewStock(book2, 8);
		stock.add(stock2);
		
		cartEntry1 = createNewCartEntry(stock1, 3);
		if(cartEntry1.isInStock()){
		cartEntry1.adjustStock();
		customer.get(0).getCart().newCartEntry.add(cartEntry1); 
		}
		
		cartEntry2 = createNewCartEntry(stock2, 5);
		if (cartEntry2.isInStock()){
		cartEntry2.adjustStock();
		customer.get(0).getCart().newCartEntry.add(cartEntry2); 
		}
	}
	
	
	
	@Test
	public void customerListSize() {
		assertNotNull(customer);
		assertTrue(customer.size()>0);
		}

	@Test
	public void customerListContentTest() {
		assertNotNull(customer.get(0));
		assertEquals("Rares Muresan", customer.get(0).getName());
		assertEquals("Aleea Retezat", customer.get(0).getAddress().getStreetName());
	}
	
	@Test
	public void cartSizeTest(){
		assertNotNull(customer.get(0).getCart());
		assertTrue(customer.get(0).getCart().newCartEntry.size()==2);
	}
	
	@Test 
	public void cartContentTest(){

		assertEquals("Absolution",customer.get(0).getCart().newCartEntry.get(0).getStock().getBook().getTitle());
		assertEquals(3 ,customer.get(0).getCart().newCartEntry.get(0).getOrderQuantity());
		assertEquals("Keep The Midnight Out",customer.get(0).getCart().newCartEntry.get(1).getStock().getBook().getTitle());
		assertEquals(5 ,customer.get(0).getCart().newCartEntry.get(1).getOrderQuantity());
	}
	
		
	@After
	public void deleteCustomer() {
		customer = null;

		System.out.println("A customer left the library right now!");
	}
	
	@After
	public void destroyStockList(){
		stock = null;
	}

	@After
	public void destroyCart(){
		cart = null;
	}
	
	@After
	public void destroyCartEntries(){
		cartEntry1 = null;
		cartEntry2 = null;

	}

}

