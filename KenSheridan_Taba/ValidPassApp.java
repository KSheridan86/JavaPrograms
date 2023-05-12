/*
ValidPassApp.java
Ken Sheridan
11/05/23
*/

//Application to validate user inputted usernames/aliases and generate random passwords
import java.util.*;

public class ValidPassApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Create a new ValidPass object with an empty string password
        ValidPass newValidPass = new ValidPass("");
        // Loop until user no longer wants to validate a username
        do {
            // Prompt user to enter username/alias
            System.out.print("\nEnter alias: ");
            String username = keyboard.nextLine();
            // Set the username of the ValidPass object to the inputted username
            newValidPass.setUsername(username);
            // Validate the username and print the result
            if (newValidPass.compute()) {
                System.out.println("\nAlias '" + username + "' is valid.");
            } else {
                System.out.println("\nAlias is invalid.");
            }
            // Ask user if they want to validate another username
            System.out.print("\nDo you want to validate another alias? (yes/no) ");
        } while (keyboard.nextLine().equalsIgnoreCase("yes"));

        // Prompt user to generate passwords
        System.out.print("\nEnter number of passwords to generate (at least 3): ");
        int numPasswords = Integer.parseInt(keyboard.nextLine());
        // Ensure the user enters a valid number of passwords
        while (numPasswords < 3) {
            System.out.print("Enter a number greater than or equal to 3: ");
            numPasswords = Integer.parseInt(keyboard.nextLine());
        }
        // Create an array to hold the mod numbers for each password
        int[] modulusNumbers = new int[numPasswords];
        // Loop through each password and get its modulus number from the user, ensure it is an original number
        for (int i = 0; i < numPasswords; i++) {
            boolean validModulusNumber = false;
            int modNumber;
            do {
                System.out.print("\nEnter random number between 11 and 19 for password " + (i + 1) + ": ");
                modNumber = Integer.parseInt(keyboard.nextLine());
                boolean alreadyEntered = false;
                for (int j = 0; j < i; j++) {
                    if (modulusNumbers[j] == modNumber) {
                        alreadyEntered = true;
                        System.out.println("Number has already been entered. Please enter a different number.");
                        break;
                    }
                }
                if (!alreadyEntered && modNumber >= 11 && modNumber <= 19) {
                    modulusNumbers[i] = modNumber;
                    validModulusNumber = true;
                } else if (!alreadyEntered) {
                    System.out.println("Invalid input. Number must be between 11 and 19 inclusive.");
                }
            } while (!validModulusNumber);
        }

        // Generate passwords using the ValidPass object and the mod numbers array
        String[] passwords = newValidPass.generatePasswords(numPasswords, modulusNumbers);
        // Print out the generated passwords
        System.out.println("\nGenerated passwords:");
        for (String password : passwords) {
            System.out.println(password);
        }
        System.out.println();
        // Close the scanner
        keyboard.close();
    }
}