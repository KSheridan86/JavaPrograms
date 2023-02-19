/*
OddOrEven.java
Ken Sheridan
10/02/23
*/
public class OddOrEven {
    //declare vars
    private int userNum;
    private String result;
    //constructor
    public OddOrEven() {
        userNum = 0;
        result = "";
    }
    //set
    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }
    //compute
    public void computeOddOrEven() {
        if (userNum % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
    }
    //get
    public String getResult() {
        return result;
    }
}