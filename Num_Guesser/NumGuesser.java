/*
NumGuesser.java
Ken Sheridan
10/02/23
*/
public class NumGuesser{
    //declare vars
    private int randomNum;
    private int userGuess;
    private String result;
    //constructor
    public NumGuesser() {
        randomNum=0;
        userGuess=0;
        result="";
    }
    //set
    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }
    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }
    //compute
    public void checkUserGuess() {
        if(userGuess == randomNum) {
            result="That is correct you are a Winner!";
        } else {
            result = "You are a Loser!";
        }
    }
    //get
    public String getResult() {
        return result;
    }
}