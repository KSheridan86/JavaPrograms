/*
Numbers.java
Ken Sheridan
02/03/23
*/
public class Average {
    //declare vars
    private int userNum1;
    private int userNum2;
    private int average;
    //constructor
    public Average() {
        userNum1 = 0;
        userNum2 = 0;
        average = 0;
    }
    //set
    public void setUserNum1(int userNum1) {
        this.userNum1 = userNum1;
    }
    public void setUserNum2(int userNum2) {
        this.userNum2 = userNum2;
    }
    //compute
    public void computeAverage() {
        average = (userNum1 + userNum2) / 2;
    }
    //get
    public int getResult() {
        return average;
    }
}