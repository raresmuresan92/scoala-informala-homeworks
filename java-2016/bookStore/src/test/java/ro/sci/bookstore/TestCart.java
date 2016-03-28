package ro.sci.bookstore;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCart {
	
		List<Book> books;
		List<Stock> stocks;
		Cart newCart;
		
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
		public void init(){
			
			books = new ArrayList<Book>();
			
			Book book1 = createNewBook("Absolution", "fiction", "Caro Ramsay", 978-1405909341, 6.99);
			books.add(book1);
			
			Book book2 = createNewBook("Keep The Midnight Out", "Mystery", "Alex Gray", 978-075155, 4.00);
			books.add(book2);
			
			Book book3 = createNewBook("Pitch Black", "Thrillers", "Alex Gray", 978-07515, 8.99);
			books.add(book3);
						
			stocks = new ArrayList<Stock>();
			
			Stock stock1 = createNewStock(book1, 3);
			stocks.add(stock1);
			
			Stock stock2 = createNewStock(book2, 5);
			stocks.add(stock2);
			
			Stock stock3 = createNewStock(book3, 8);
			stocks.add(stock3);
			
			newCart = new Cart();
			
			CartEntry cartEntry1 = createNewCartEntry(stock1, 2);
			if (cartEntry1.isInStock()){
				cartEntry1.adjustStock();
				newCart.newCartEntry.add(cartEntry1); // add to cart 2 books with the price 6.99 
			}
			
			CartEntry cartEntry2 = createNewCartEntry(stock2, 1);
			if (cartEntry2.isInStock()){
				cartEntry2.adjustStock();
				newCart.newCartEntry.add(cartEntry2);// add to cart 1 book with the price 4.00
			}
		
			CartEntry cartEntry3 = createNewCartEntry(stock3, 3);
			if (cartEntry3.isInStock()){
				cartEntry3.adjustStock();
				newCart.newCartEntry.add(cartEntry3); //add to cart 3 books with the price 8.99
			}
		}
		
		@Test
		public void testBookListSize(){
			assertNotNull(books);
			assertTrue(books.size()>0);
		}
		
		@Test
		public void testStockListSize(){
			assertNotNull(stocks);
			assertTrue(stocks.size()>0);
		}
		
		
		@Test
		public void testBookListContent(){
			Book book = books.get(0);
			assertEquals("Absolution", book.getTitle());
			assertEquals(6.99, book.getPrice(),0);
		}
		
		@Test
		public void testStockListContent(){
			Stock stock = stocks.get(1);
			assertNotNull(stock.getBook());
			assertEquals("Keep The Midnight Out", stock.getBook().getTitle());
		}
		
		@Test
		public void testCartSize(){
			assertNotNull(newCart);
			assertTrue(newCart.newCartEntry.size()>0);
			assertEquals(3,newCart.newCartEntry.size());
		}

		@Test
		public void testCartListContent(){
			
			CartEntry cartEntry = newCart.newCartEntry.get(0);
			assertEquals("Absolution", cartEntry.getStock().getBook().getTitle());
			
			cartEntry = newCart.newCartEntry.get(1);
			assertEquals("Keep The Midnight Out", cartEntry.getStock().getBook().getTitle());
			
			cartEntry = newCart.newCartEntry.get(2);
			assertEquals("Pitch Black", cartEntry.getStock().getBook().getTitle());
			
		}
			
		
		
		@After
		public void destroyBooksList() {
			//destroy book list
			books = null;
		}
		
		@After
		public void destroyStocksList() {
			//destroy stock list
			stocks = null;
		}
		
		@After
		public void destroyCart() {
			//destroy cart
			newCart = null;
		}
	
}
