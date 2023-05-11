/*
ValidPassAppApp.java
Ken Sheridan
11/05/23
*/

//Application to validate user inputted usernames/aliases and generate random passwords
import java.util.Scanner;

public class ValidPassApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // Create a new ValidPass object with an empty string password
        ValidPass newValidPass = new ValidPass("");
        // Loop until user no longer wants to validate a username
        do {
            // Prompt user to enter username
            System.out.print("Enter username: ");
            String username = keyboard.nextLine();
            // Set the username of the ValidPass object to the inputted username
            newValidPass.setUsername(username);
            // Validate the username and print the result
            if (newValidPass.compute()) {
                System.out.println("Username is valid.");
            } else {
                System.out.println("Username is invalid.");
            }
            // Ask user if they want to validate another username
            System.out.print("Do you want to validate another username? (yes/no) ");
        } while (keyboard.nextLine().equalsIgnoreCase("yes"));

        // Prompt user to generate passwords
        System.out.print("Enter number of passwords to generate (at least 3): ");
        int numPasswords = Integer.parseInt(keyboard.nextLine());
        // Ensure the user enters a valid number of passwords
        while (numPasswords < 3) {
            System.out.print("Enter a number greater than or equal to 3: ");
            numPasswords = Integer.parseInt(keyboard.nextLine());
        }
        // Create an array to hold the mod numbers for each password
        int[] modulusNumbers = new int[numPasswords];
        // Loop through each password and get its mod number from the user
        for (int i = 0; i < numPasswords; i++) {
            boolean validModNumber = false;
            do {
                System.out.print("Enter random number between 11 and 19 for password " + (i + 1) + ": ");
                int modNumber = Integer.parseInt(keyboard.nextLine());
                // Validate the mod number and add it to the array if it's valid
                if (modNumber >= 11 && modNumber <= 19) {
                    modulusNumbers[i] = modNumber;
                    validModNumber = true;
                } else {
                    System.out.println("Invalid input. Number must be between 11 and 19 inclusive.");
                }
            } while (!validModNumber);
        }

        // Generate passwords using the ValidPass object and the mod numbers array
        String[] passwords = newValidPass.generatePasswords(numPasswords, modulusNumbers);
        // Print out the generated passwords
        System.out.println("Generated passwords:");
        for (String password : passwords) {
            System.out.println(password);
        }
        // Close the scanner
        keyboard.close();
    }
}