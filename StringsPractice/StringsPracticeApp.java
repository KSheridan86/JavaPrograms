import java.util.*;

public class StringsPracticeApp {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner keyboard = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("\nPlease enter a string: ");
        
        // Read the input string from the console
        String input = keyboard.nextLine();
        
        // Create an instance of TextAnalyzer with the input string
        StringsPractice analyzer = new StringsPractice(input);
        
        // Call each method of TextAnalyzer to perform text analysis tasks and print the results to the console
        System.out.println("\nNumber of letters: " + analyzer.countLetters());
        System.out.println("\nNumber of vowels: " + analyzer.countVowels());
        System.out.println("\nEvery second letter: " + analyzer.getEverySecondLetter());
        System.out.println("\nPositions of spaces: " + analyzer.getSpacePositions());
        System.out.println("\nString with vowels replaced by exclamation points: " + analyzer.replaceVowelsWithExclamation() + "\n");
        keyboard.close();
    }
}