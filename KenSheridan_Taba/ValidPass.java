/*
ValidPass.java
Ken Sheridan
11/05/23
*/

import java.util.*;

public class ValidPass {
    // data member
    private String username;

    // constructor
    public ValidPass(String username) {
        setUsername(username);
    }
    
    // setter for username
    public void setUsername(String username) {
        this.username = username;
    }
    
    // getter for username
    public String getUsername() {
        return this.username;
    }

    // method to validate username
    public boolean compute() {
        // Check length
        if (username.length() != 24) {
            return false;
        }
        
        // Check first 3 characters
        if (!username.substring(0, 3).equalsIgnoreCase("aib")) {
            return false;
        }
        
        // Check characters 4 and 5
        if (!Character.isDigit(username.charAt(3)) || !Character.isDigit(username.charAt(4))) {
            return false;
        }
        
        // Check characters 6 to 13
        if (!username.substring(5, 13).equals("49210955")) {
            return false;
        }
        
        // Check characters 14 to 21
        for (int i = 13; i < 21; i++) {
            if (!Character.isDigit(username.charAt(i))) {
                return false;
            }
        }
        
        // Check characters 22 to 24
        int prev = -1;
        for (int i = 21; i < 24; i++) {
            if (!Character.isDigit(username.charAt(i))) {
                return false;
            }
            
            int digit = Character.getNumericValue(username.charAt(i));
            if (digit <= prev) {
                return false;
            }
            
            prev = digit;
        }
        
        // All checks passed
        return true;
    }

    // method to generate passwords
    public String[] generatePasswords(int numPasswords, int[] modNumbers) {
        String[] passwords = new String[numPasswords];
        Random rand = new Random();

        // generate each password
        for (int i = 0; i < numPasswords; i++) {
            int mod = 49210955 % modNumbers[i]; // perform modulo calculation
            String password = mod + "@"; // add mod number to password
            for (int j = 0; j < 6; j++) {
                char c = (char) (rand.nextInt(26) + 'A'); // generate random uppercase letter
                password += c; // add letter to password
            }
            passwords[i] = password; // add password to array
        }
        return passwords; // return array of passwords
    }
}