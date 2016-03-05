import java.util.ArrayList;
import java.util.Scanner;

public class Novel extends Book {

	static Scanner userInput = new Scanner(System.in);//this variable is use in addNovel method
	
	String novelType;//this variable is used only for Nove and is in addition to the Book class  
	
	//An array of Novels objects.
	//ArrayList constructor
	static ArrayList<Novel>novelsList = new ArrayList<Novel>() ;
	
	static Novel n;//this variable is used in addNovel method
	
	
	//default constructor for Novel
	public Novel(){
		
	}
	
	//second constructor for Novel
	public Novel(String bookName, int numberOfPages, String novelType) {
		super(bookName, numberOfPages);
		this.novelType = novelType;
	}
	

	public String getNovelType(){
		return novelType;
	}
	
	public static void addNovel(){
        System.out.println("> Enter the name of the novel: ");
        String bookName = userInput.nextLine();
        System.out.println("> Enter the novel type: ");
        String novelType = userInput.nextLine();
        System.out.println("> Enter the number of pages: ");
        Integer numberOfPages = userInput.nextInt();
        
        n = new Novel(bookName, numberOfPages, novelType);
        novelsList.add(n);
	}
	
	public static void listNovelsName(){
		for(int i = 0; i<novelsList.size(); i++){
			System.out.println("> Novel list is: " +novelsList.get(i).getBookName());
		}
		
	}
	public static void listNovels(){
		System.out.println("_________________________________________________________________");
		System.out.println("Number of novels is : " + novelsList.size());
		for(int i = 0; i<novelsList.size(); i++){
			System.out.println("_________________________________________________________________");
			System.out.println("> The name of the novel is: " +novelsList.get(i).getBookName());
			System.out.println("> Number of pages is: " +novelsList.get(i).getNumberOfPages());
			System.out.println("> Novel type is: " +novelsList.get(i).getNovelType());
			System.out.println("_________________________________________________________________");
		}
	}
	
	public static void deleteNovel(){
		System.out.println("_________________________________________________________________");
		Novel.listNovelsName();
		System.out.println("> Enter the name of the novel you want to remove it: ");
		String novelToDelete = userInput.next();
		for(int i = 0; i<novelsList.size(); i++){
			if(novelToDelete.equals(novelsList.get(i).getBookName())){
				int indexOfObject = novelsList.indexOf(novelsList.get(i));
				novelsList.remove(indexOfObject);
			}
		}
		
	}

}