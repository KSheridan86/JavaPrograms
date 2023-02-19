/*
LeapYearApp.java
Ken Sheridan
16/02/23
*/

//Application to determine whether a user inputted year is a leap year or not.
import java.util.*;
import java.lang.Thread;
public class LeapYearApp {
    public static void main(String[] args) {
        //declare vars
        int year = 0 ;
        String result;
        //declare and create objects
        Scanner keyboard = new Scanner(System.in);
        LeapYear check;
        check = new LeapYear();
        //inputs
        System.out.println("Welcome to the leap year index.");
        System.out.println("Type the current year (2023) to exit, spoiler alert, this year is not a leap year.");
        // while loop used to keep the program running, great for testing
        while (year >= 0) {
            System.out.println("Please enter a year as a whole number, ie.. 1999 or 1628...");
            year = keyboard.nextInt();
            if (year == 2023) {
                keyboard.close();
                break;
            }
            //set
            check.setYear(year);
            //compute
            check.checkIfLeapYear();
            //get
            result = check.getResult();
            //output
            System.out.println("The year you entered" + result +"\n#####################################");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}