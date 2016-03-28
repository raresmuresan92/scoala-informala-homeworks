package ro.sci.bookstore;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCartEntry {

	Book book1;

	Stock stock1;

	CartEntry cartEntry1, cartEntry2, cartEntry3;
	
	private Book createNewBook(String title, String genre, String author, int isbn, double price) {
		Book book = new Book(isbn);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setTitle(title);
		book.setPrice(price);
		book.setWeight(200);

		return book;
	}

	private Stock createNewStock(Book book, int quantity) {
		Stock stock = new Stock(book, quantity);
		stock.setBook(book);
		stock.setQuantity(quantity);

		return stock;
	}

	private CartEntry createNewCartEntry(Stock stock, int orderQuantity) {
		CartEntry cartEntry = new CartEntry(stock, orderQuantity);
		cartEntry.setStock(stock);
		cartEntry.setOrderQuantity(orderQuantity);

		return cartEntry;
	}

	@Before

	public void init() {

		Book book1 = createNewBook("Absolution", "fiction", "Ramsey Keller", 978-1405909341, 6.99);
		Stock stock1 = createNewStock(book1, 5); // stock quantity for book1 is 5 pieces
		Stock stock2 = createNewStock(book1, 5);
		Stock stock3 = createNewStock(book1, 5);

		cartEntry1 = createNewCartEntry(stock1, 2);
		cartEntry2 = createNewCartEntry(stock2, 5); 
		cartEntry3 = createNewCartEntry(stock3, 8); 
	}

	@Test
	public void isInStockTest() {
		assertTrue(cartEntry1.isInStock());
		assertTrue(cartEntry2.isInStock());
		assertFalse(cartEntry3.isInStock());
	}

	@Test
	public void adjustStockTest() {
		cartEntry1.adjustStock();
		assertEquals(3, cartEntry1.getStock().getQuantity()); //stockQuantity > orderQuantiy

		cartEntry2.adjustStock();
		assertEquals(0, cartEntry2.getStock().getQuantity()); // stockQuantity = orderQuantity

		cartEntry3.adjustStock();
		assertEquals(5, cartEntry3.getStock().getQuantity()); // stockQuantity < orderQuantity
	}

	@After
	public void destroy() {
		book1 = null;
		stock1 = null;
		cartEntry1 = null;
		cartEntry2 = null;
		cartEntry3 = null;
	}

}
