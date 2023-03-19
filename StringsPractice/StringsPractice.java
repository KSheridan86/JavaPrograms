public class StringsPractice {
    // Declare a private field to store the input string
    private String input;

    // Constructor that takes in an input string and assigns it to the input field
    public StringsPractice(String input) {
        this.input = input;
    }

    // Method to count the number of letters in the input string
    public int countLetters() {
        int count = 0;
        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is a letter, increment the count
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
    }

    // Method to count the number of vowels in the input string
    public int countVowels() {
        int count = 0;
        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is a vowel, increment the count
            if (isVowel(c)) {
                count++;
            }
        }
        return count;
    }

    // Method to create a new string that contains every second letter of the input string
    public String getEverySecondLetter() {
        StringBuilder secondLetter = new StringBuilder();
        // Iterate over the input string with a step of 2
        for (int i = 0; i < input.length(); i += 2) {
            // Append each second character to the StringBuilder
            secondLetter.append(input.charAt(i));
        }
        return secondLetter.toString();
    }

    // Method to find the positions of each space in the input string
    public String getSpacePositions() {
        StringBuilder sb = new StringBuilder();
        // Iterate over each character in the input string
        for (int i = 0; i < input.length(); i++) {
            // If the character is a space, append its position to the StringBuilder
            if (input.charAt(i) == ' ') {
                sb.append(i).append(' ');
            }
        }
        // Remove the trailing space from the StringBuilder and return the resulting string
        return sb.toString().trim();
    }

    // Method to replace each vowel in the input string with an exclamation point
    public String replaceVowelsWithExclamation() {
        StringBuilder sb = new StringBuilder();
        // Iterate over each character in the input string
        for (char c : input.toCharArray()) {
            // If the character is a vowel, append an exclamation point to the StringBuilder
            if (isVowel(c)) {
                sb.append('!');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}