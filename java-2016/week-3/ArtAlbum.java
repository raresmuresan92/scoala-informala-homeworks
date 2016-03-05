import java.util.ArrayList;
import java.util.Scanner;

public class ArtAlbum extends Book {
	
	static Scanner userInput = new Scanner(System.in);//this variable is used in addArtAlbum method
	
	String pageQuality;//this variable is used only for ArtAlbum and is in addition to the Book class 
	
	//An array of ArtAlbum objects.
	//ArrayList constructor
	static ArrayList<ArtAlbum>artAlbumList = new ArrayList<ArtAlbum>() ;
	
	static ArtAlbum a;//this variable is used in addArtAlbum method
	
	//default Constructor
	public ArtAlbum(){
		
	}
	
	//second Constructor for ArtAlbum
	public ArtAlbum(String bookName, int numberOfPages, String pageQuality) {
		super(bookName, numberOfPages);
		this.pageQuality = pageQuality;
	}
	
	public String getPageQuality(){
		return pageQuality;
	}
	
	public static void addArtAlbum(){
        System.out.println("> Enter the name of the art album: ");
        String bookName = userInput.nextLine();
        System.out.println("> Enter the page quality (Silver, Bronze, Gold): ");
        String pageQuality = userInput.nextLine();
        System.out.println("> Enter the number of pages: ");
        Integer numberOfPages = userInput.nextInt();
        
        a = new ArtAlbum(bookName, numberOfPages, pageQuality);
        artAlbumList.add(a);
	}
	
	public static void listArtAlbumsName(){
		for(int i = 0; i<artAlbumList.size(); i++){
			System.out.println("> Album list is: " +artAlbumList.get(i).getBookName());
		}
	}
	
	public static void listArtAlbums(){
		
		System.out.println("Number of art albums is : " + artAlbumList.size());
		for(int i = 0; i<artAlbumList.size(); i++){
			System.out.println("_________________________________________________________________");
			System.out.println("> The name of the art album is: " +artAlbumList.get(i).getBookName());
			System.out.println("> Number of pages is: " +artAlbumList.get(i).getNumberOfPages());
			System.out.println("> The page quality is: " +artAlbumList.get(i).getPageQuality());
			System.out.println("_________________________________________________________________");
		}
	}
	
	public static void deleteArtAlbum(){
		System.out.println("_________________________________________________________________");
		ArtAlbum.listArtAlbumsName();
		System.out.println("> Enter the name of the art album you want to remove it: ");
		String artAlbumToDelete = userInput.next();
		for(int i = 0; i<artAlbumList.size(); i++){
			if(artAlbumToDelete.equals(artAlbumList.get(i).getBookName())){
				int indexOfObject = artAlbumList.indexOf(artAlbumList.get(i));
				artAlbumList.remove(indexOfObject);
			}
		}
	}
		
}