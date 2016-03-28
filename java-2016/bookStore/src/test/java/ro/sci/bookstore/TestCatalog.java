package ro.sci.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCatalog {

	// declare Catalog
	List<Book> catalog = null;
	
	@Before
	public void intCatalog() {
		// int catalog
		catalog = new ArrayList<Book>();
		catalog.add(createNewBook("Abecedar", "Education", "profu", 1000, 15d));
		System.out.println("Am intrat!");
	}

	@Test
	public void testCatalogSize() {
		assertNotNull(catalog);
		assertTrue(catalog.size() > 0);
	}

	@Test
	public void testCatalogContent() {
		Book firstBook = catalog.get(0);

		assertEquals("Abecedar", firstBook.getTitle());

	}

	private Book createNewBook(String title, String genre, String author, int isbn, double price) {
		Book book = new Book(isbn);
		book.setAuthor(author);
		book.setGenre(genre);
		book.setPrice(price);
		book.setTitle(title);
		book.setWeight(200);
		return book;
	}

	@After
	public void destroyCatalog() {
		// int catalog
		catalog = null;

		System.out.println("Am iesit!");
	}

}

    
