import java.util.Scanner;

public class MakeDecision {
	static Scanner userInput = new Scanner(System.in);
	
	static int choiceInput;
	static int choiceInput2;
	static int choiceInput3;
	
	
	public void makeDecision(){
		
		System.out.println("_________________________________________________________________");
		System.out.println(">>> Welcome to the Libray Catalaog <<<");
		System.out.println("> Choose one of the options below: ");
		System.out.println("(1): Add a book. ");		
		System.out.println("(2): Display the list of books. ");
		System.out.println("(3): Delete a book. ");
		System.out.println("_________________________________________________________________");
		choiceInput = userInput.nextInt();
		
		switch(choiceInput){
		
		case 1:
			System.out.println("_________________________________________________________________");
			System.out.println(">>You choose to add a book.<<");
			System.out.println(">>Choose what type of book do you want to add.<< ");
			System.out.println("(1): Novel. ");
			System.out.println("(2): Art album. ");
			choiceInput2 = userInput.nextInt();
			if (choiceInput2 == 1) {
				System.out.println(">>You have chosen to add a novel.<<");
				Novel.addNovel();
			} else if (choiceInput2 == 2) {
				System.out.println(">>You have chosen to add art album.<<");
				ArtAlbum.addArtAlbum();
			} else {
				System.out.println("_________________________________________________________________");
				System.out.println("You did not choose from the options available. ");
			}
			break;
		case 2:
			System.out.println("You choose to display the list of books. ");
			Novel.listNovels();
			ArtAlbum.listArtAlbums();
			break;		
		case 3:
			System.out.println(">> You choose to delete a book. <<");
			System.out.println("> Choose what type of book do you want to delete.<< ");
			System.out.println("(1): Novel. ");
			System.out.println("(2): Art album. ");
			choiceInput3 = userInput.nextInt();
			switch(choiceInput3){
			case 1:
				System.out.println(">>You have chosen to delete a novel.<<");
				Novel.deleteNovel();
				break;
			case 2:
				System.out.println(">>You have chosen to delete a art album.<<");
				ArtAlbum.deleteArtAlbum();
				break;
			default:
				System.out.println("_________________________________________________________________");
				System.out.println("You did not choose from the options available. ");
				break;
			}
		}
	}

}
