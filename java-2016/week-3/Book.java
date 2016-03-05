public class Book {
	
	public String bookName;
	public int numberOfPages;

	//default Book Constructor
	public Book(){
		
	}
	
	//second Constructor for Book
	public Book(String bookName, int numberOfPages){
		this.bookName = bookName;
		this.numberOfPages = numberOfPages;
	}
	
	public String getBookName(){
		return bookName;
	}
	public int getNumberOfPages(){
		return numberOfPages;
	}
	

	
}