/**
 * #####################################################
 * This program was made by Rares Muresan and it is free.
 * #####################################################
 * >This is an library application that can add book, display and delete them.
 * >This program has a few bugs:
 * >a)> If the number of pages you enter is a letter and not a number, the application will crack.
 * 
 * >b)> When you call the menu again and choose to add the same kind of book you can't enter the name.
 * 
 * >c)> The only way I know to create the menu was the switch.
 *    > This method is long and generates a series of bugs.
 */
import java.util.Scanner;

public class LibraryCatalogApp {
	
	static MakeDecision decision = new MakeDecision();
	static Scanner userInput = new Scanner(System.in);
	static int choiceInput;
	
	public static void main(String[] args) {
		
		decision.makeDecision();
		System.out.println("_________________________________________________________________");
		System.out.println("> What do you want to do now? <");
		System.out.println("(1) Exit program. ");
		System.out.println("(2) Continue program. ");
		System.out.println("_________________________________________________________________");
		choiceInput = userInput.nextInt();
		
		switch(choiceInput){
		
		case 1:
			System.out.println("_________________________________________________________________");
			System.out.println(">>You choose to exit.<<");
			System.out.println(">>Bye bye!<< ");
			System.out.println("_________________________________________________________________");
			break;
		case 2:
			decision.makeDecision();
			System.out.println("_________________________________________________________________");
			System.out.println("> What do you want to do now? <");
			System.out.println("(1) Exit program. ");
			System.out.println("(2) Continue program. ");
			System.out.println("_________________________________________________________________");
			choiceInput = userInput.nextInt();
			
			switch(choiceInput){
			
			case 1:
				System.out.println("_________________________________________________________________");
				System.out.println(">>You choose to exit.<<");
				System.out.println(">>Bye bye!<< ");
				System.out.println("_________________________________________________________________");
				break;
			case 2:
				decision.makeDecision();
				
				break;
			default:
				System.out.println("You did not choose from the options available. ");
			}
			break;
		default:
			System.out.println("You did not choose from the options available. ");
		}
	}

}