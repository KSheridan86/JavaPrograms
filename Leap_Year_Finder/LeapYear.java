/*
LeapYear.java
Ken Sheridan
16/02/23
*/
public class LeapYear {
    //declare vars
    private int year;
    private String result;
    //constructor
    public LeapYear() {
        year = 0;
        result = "";
    }
    //set
    public void setYear(int year) {
        this.year = year;
    }
    //compute
    public void checkIfLeapYear() {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    result = " is a leap year.";
                } else {
                    result = " is not a leap year.";
                }
            } else {
                result = " is a leap year.";
            }
        } else {
            result = " is not a leap year.";
        }
    }
    //get
    public String getResult() {
        return result;
    }
}