package Exam;

import java.util.*;

public class TextAnalyzer {
    // Variables
    private String userInput;
    private int numVerbs;
    // Constructor
    public TextAnalyzer() {
        userInput = "";
        numVerbs = 0;
    }
    // Setter
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }
    // Getter
    public int getNumVerbs() {
        return numVerbs;
    }
    // Compute
    public void computeString() {
        List<String> words = new ArrayList<>();
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < userInput.length(); i++) {
            char singleChar = userInput.charAt(i);
            if (singleChar == ' ' || singleChar == '.') {
                if (newString.length() > 0) {
                    words.add(newString.toString());
                    newString.setLength(0);
                }
            } else {
                newString.append(singleChar);
            }
        }
        if (newString.length() > 0) {
            words.add(newString.toString());
        }
        for (String word : words) {
            int length = word.length();
            if (length > 2 && word.charAt(length - 1) == 'g' && word.charAt(length - 2) == 'n' && word.charAt(length - 3) == 'i') {
                numVerbs++;
            }
        }
    }
}