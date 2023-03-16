package MobileNumber;
/*
MobileNumber.java
Ken Sheridan
16/03/23
*/
import java.util.*;
public class MobileNumberApp {
    public static void main(String args[]) {
        String number, message;

        Scanner keyboard = new Scanner (System.in);
        MobileNumber myMobileNumber = new MobileNumber();

        System.out.print("Enter your mobile number: ");
        number = keyboard.nextLine();
        myMobileNumber.compute();
        message = myMobileNumber.getMessage();
        System.out.println(message);
    }
}
