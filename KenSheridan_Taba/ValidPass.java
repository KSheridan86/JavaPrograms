/*
ValidPass.java
Ken Sheridan
11/05/23
*/
import java.util.*;

public class ValidPass {
    // Data members
    private String username;
    // Constructor
    public ValidPass(String username) {
        this.username = username;
    }
    // Setter for username
    public void setUsername(String username) {
        this.username = username;
    }
    // Getter for username
    public String getUsername() {
        return this.username;
    }
    // Compute method to validate username
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
        for (int i = 3; i < 5; i++) {
            if (username.charAt(i) >= '0' && username.charAt(i) <= '9') {
                // Check characters 6 to 13
                if (!username.substring(5, 13).equals("49210955")) {
                    return false;
                }
                // Check characters 14 to 21
                for (int j = 13; j < 21; j++) {
                    if (username.charAt(j) >= '0' && username.charAt(j) <= '9') {
                        // Check characters 22 to 24
                        for (int k = 21; k <= 23; k++) {
                            if (username.charAt(k) >= '0' && username.charAt(k) <= '9') {
                                if (username.charAt(21) < username.charAt(22)) {
                                    if (username.charAt(22) < username.charAt(23)) {
                                        continue;
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        }
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        // All checks passed
        return true;
    }

    // method to generate passwords
    public String[] generatePasswords(int numPasswords, int[] modulusNumbers) {
        String[] passwords = new String[numPasswords];
        Random randomLetter = new Random();

        // generate each password
        for (int i = 0; i < numPasswords; i++) {
            // perform modulus calculation
            int resultOfModulus = 49210955 % modulusNumbers[i];
            // add resultOfModulus number to password
            String password = resultOfModulus + "@";
            for (int j = 0; j < 6; j++) {
                // generate random uppercase letter
                char upperCaseLetter = (char)(randomLetter.nextInt(26) + 'A');
                // add letter to password
                password += upperCaseLetter;
            }
            // add password to array
            passwords[i] = password;
        }
        // return array of passwords
        return passwords;
    }
}