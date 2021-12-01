package HangmanPack.Hangman;


/*
 * Problem Statement: In the Hangman game, when a user decides to play the Hangman game, 
 * the numbers of dashes or blanks that are equal to the length of a word are displayed. 
 * To implement this, Peter needs to store a group of words, randomly pick a word, 
 * calculate the length of the word, and finally displays the number of dashes or blanks. 
 * In addition, he wants to implement the functionality that takes an alphabetical character 
 * as an input from the user, check if the character entered by the user exists in the 
 * corresponding word, and display the letter in the appropriate dashes. 
 * However, if the character doesn’t exist in the word, it is added to the list of missed letters.
 *  Help Peter to achieve the preceding requirement.
 *  
 *  
 *  Task 1(Row 1):
 *  Use the length of the words to display the dashes
 *  
 *  Task 2(Row 1):
 *  Check if the character exists in the word
 *  
 *  Task 3(Row 2):
 *  Implement the functionality that takes an alphabetical character as an input from the user
 *  
 *  Task 4(Row 3):
 *  Storing the words inside an array and randomly picking a word
 *  
 */

// Necessary Imports Go Here:
import java.util.Scanner;
// Imports End Here.

public class Hangman {
	//	Define Variables Here
	
	
	public static void main(String[] args) {
		displayBlanks("Heaven");
	}
	
	static void displayBlanks(String word){
		//TODO: Row 1
		for (int i = 0; i < word.length(); i++) {
			System.out.print("_ ");
		}
	}
	
	void userInput() {
		//TODO: Row 2
	}
	
	void validateInput() {
		//TODO: Row 1
	}
	
	void randomPick() {
		//TODO: Row 3
	}
}
