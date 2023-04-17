/*
Validate_Email_App.java
Ken Sheridan
17/04/23
*/

//Application to determine whether a user inputted email address is valid
import java.util.*;

public class Validate_Email_App {
    public static void main(String[] args) {
        // Objects 
        Scanner keyboard = new Scanner(System.in);

        // Inputs
        System.out.print("Please enter an email address: ");
        String emailAddress = keyboard.nextLine();
        System.out.print("Please enter your preferred domain extensions separated by a comma: ");
        String[] domainExtensions = keyboard.nextLine().split(",");

        // Create instance of Validate_Email and set input values
        Validate_Email validator = new Validate_Email();
        validator.setEmailAddress(emailAddress);
        validator.setDomainExtensions(domainExtensions);

        // Set & Print the result from the validation method
        String result = validator.validateEmail();
        System.out.println(result);
        keyboard.close();
    }
}