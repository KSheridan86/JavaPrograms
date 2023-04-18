package Exam;

import java.util.Scanner;

public class TextAnalyzerApp {
    public static void main(String[] args) {
        // Vars
        String userInput = "";
        int numVerbs = 0;
        // Objects
        Scanner keyboard = new Scanner(System.in);
        TextAnalyzer ta = new TextAnalyzer();
        // Get data
        System.out.print("Enter a sentence: ");
        userInput = keyboard.nextLine();
        // Call methods
        ta.setUserInput(userInput);
        ta.computeString();
        numVerbs = ta.getNumVerbs();

        System.out.println("The number of words ending in 'ing' is: " + numVerbs);
        keyboard.close();
    }
}