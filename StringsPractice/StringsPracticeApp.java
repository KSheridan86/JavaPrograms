/*
StringsPracticeApp.java
Ken Sheridan
21/03/23
*/

// App to run a host of checks on a given string and return the results
import java.util.*;
public class StringsPracticeApp {
    public static void main(String[] args) {
        // Objects & Vars
        String input;
        StringsPractice checkIt;
        Scanner keyboard = new Scanner(System.in);
        
        // Input
        System.out.print("\nPlease enter a string: ");
        input = keyboard.nextLine();
        checkIt = new StringsPractice(input);
        
        // Call each method of StringsPractice to check results and print them to the console
        System.out.println("\nNumber of letters: " + checkIt.countLetters());
        System.out.println("\nNumber of vowels: " + checkIt.countVowels());
        System.out.println("\nEvery second letter: " + checkIt.getEverySecondLetter());
        System.out.println("\nPositions of spaces: " + checkIt.getSpacePositions());
        System.out.println("\nString with vowels replaced by exclamation points: " + checkIt.replaceVowelsWithExclamation() + "\n");
        keyboard.close();
    }
}