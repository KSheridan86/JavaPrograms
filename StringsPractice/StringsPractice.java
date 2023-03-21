/*
StringsPractice.java
Ken Sheridan
21/03/23
*/

public class StringsPractice {
    // Vars
    private String input;
    // Objects
    StringBuilder secondLetter = new StringBuilder();
    StringBuilder spaceString = new StringBuilder();
    StringBuilder noVowels = new StringBuilder();
    // Constructor
    public StringsPractice(String input) {
        this.input = input;
    }

    // Multiple Classes/Methods to compute the required results

    // Method to count the number of letters in the input string
    public int countLetters() {
        int count = 0;
        // Iterate over each character in the input string
        for (char each : input.toCharArray()) {
            // If the character is a letter, increment the count
            if (Character.isLetter(each)) {
                count++;
            }
        }
        return count;
    }

    // Method to count the number of vowels in the input string
    public int countVowels() {
        int count = 0;
        // Iterate over each character in the input string
        for (char each : input.toCharArray()) {
            // If the character is a vowel, increment the count
            if (isVowel(each)) {
                count++;
            }
        }
        return count;
    }

    // Method to create a new string that contains every second letter of the input string
    public String getEverySecondLetter() {
        // Iterate over the input string with a step of 2
        for (int i = 0; i < input.length(); i += 2) {
            // Append each second character to the StringBuilder
            secondLetter.append(input.charAt(i));
        }
        return secondLetter.toString();
    }

    // Method to find the positions of each space in the input string
    public String getSpacePositions() {
        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // If the character is a space, append its position to the StringBuilder
            if (input.charAt(i) == ' ') {
                spaceString.append(i).append(' ');
            }
        }
        // Remove the trailing space from the StringBuilder and return the resulting string
        return spaceString.toString().trim();
    }

    // Method to replace each vowel in the input string with an exclamation point
    public String replaceVowelsWithExclamation() {
        // Iterate over each character in the input string
        for (char each : input.toCharArray()) {
            // If the character is a vowel, append an exclamation point to the StringBuilder
            if (isVowel(each)) {
                noVowels.append('!');
            } else {
                noVowels.append(each);
            }
        }
        return noVowels.toString();
    }

    private boolean isVowel(char checkVowel) {
        return "aeiouAEIOU".indexOf(checkVowel) != -1;
    }
}