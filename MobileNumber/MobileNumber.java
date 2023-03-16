package MobileNumber;
// /*
// MobileNumber.java
// Ken Sheridan
// 16/03/23
// */

// // Create an application to check for a valid mobile phone number. 
// // A valid mobile phone number is 10 digits in total and should start with either, 083, 085 or 087. 
// // The application should ask the user for their mobile number and output if the number is valid or invalid.

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

if (number.length() == 10) { //if the number has a length of 10
    //if the number has a character at index zero and its equal to a zero, do the following
    if ((number.charAt(0) == '0') && (number.charAt(1) == '8')) {
        if (number.charAt(2) == '3' || number.charAt(2) == '5' || number.charAt(2) == '7') {
            message = "This is a valid number";
        } else {
            message = "This is not a valid number";
        }
    }
}


        if (number.length() == 10) {

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


// public class MobileNumber {

//     //Data members

//     private String number; //input
//     private String message; //Output

//     //constructor
//     public MobileNumber() {
//         number = "";
//         message = "";
//     }

//     //Setter
//     public void setNumber(String number) {
//         this.number = number;
//     }

//     //Compute
//     public void compute() {
//         //check for the length
//         if (number.length() == 10) { //if the number has a length of 10
//             //if the number has a character at index zero and its equal to a zero, do the following
//             if ((number.charAt(0) == '0') && (number.charAt(1) == '8')) {
//                 if (number.charAt(2) == '3' || number.charAt(2) == '5' || number.charAt(2) == '7') {
//                     message = "This is a valid number";
//                 } else {
//                     message = "This is not a valid number";
//                 }
//             }
//         }
//     }

//     //Getter
//     public String getMessage() {
//         return message;
//     }





// }