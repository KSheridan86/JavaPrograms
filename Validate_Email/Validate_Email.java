/*
Validate_Email.java
Ken Sheridan
17/04/23
*/

import java.util.*;

public class Validate_Email {
    // Vars
    private String emailAddress;
    private String[] domainExtensions;

    // Getters
    public String getEmailAddress() {
        return emailAddress;
    }
    public String[] getDomainExtensions() {
        return domainExtensions;
    }
    // Setters
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public void setDomainExtensions(String[] domainExtensions) {
        this.domainExtensions = domainExtensions;
    }

    // Method
    public String validateEmail() {
        String[] emailParts = emailAddress.split("@");
        if (emailParts.length != 2) {
            return "Invalid email address: Must contain a single @ symbol";
        }
        String domain = emailParts[1];
        String[] domainParts = domain.split("\\.");
        if (domainParts.length != 2) {
            return "Invalid email address: Domain must have a . before the extension";
        }
        String extension = domainParts[1];
        if (!Arrays.asList(domainExtensions).contains(extension)) {
            return "Invalid email address: Extension must be one of " + Arrays.toString(domainExtensions);
        }
        return "Valid email address: All conditions are met";
    }
}