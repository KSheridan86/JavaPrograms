package MobileNumber;
/*
MobileNumber.java
Ken Sheridan
16/03/23
*/

// Create an application to check for a valid mobile phone number. 
// A valid mobile phone number is 10 digits in total and should start with either, 083, 085 or 087. 
// The application should ask the user for their mobile number and output if the number is valid or invalid.

public class MobileNumber {
    // data Members
    private String number; // input
    private String message; // output
    // constructor
    public MobileNumber() {
        number = "";
        message = "";
    }
    // setters
    public void setNumber(String number) {
        this.number = number;
    }
    // compute
    public void compute() {
        // check if number is 10 digits
        if (number.length() <= 10) {
            
            // if (number.charAt(0) == '0' && number.charAt(1) == '8') {
            //      if (number.charAt(2) == '3' || number.charAt(2) == '5' || number.charAt(2) == '7') {
            //          message = "Valid"; }
            
            if (number.startsWith("083") || number.startsWith("085") || number.startsWith("087")) {
                message = "Valid";
            } else {
                message = "Invalid";
            }
        } else {
            message = "length problem";
        }
    }
    // getters
    public String getMessage() {
        return message;
    }
}