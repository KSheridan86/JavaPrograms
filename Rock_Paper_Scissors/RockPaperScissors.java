/*
RockPaperScissors.java
Ken Sheridan
19/02/23
*/

public class RockPaperScissors {
    //declare vars
    private int userChoice;
    private int compChoice;
    private String result;
    //constructor
    public RockPaperScissors() {
        userChoice = 0;
        compChoice = 0;
        result = "";
    }
    //set
    public void setUserChoice(int userChoice) {
        this.userChoice = userChoice;
    }
    public void setCompChoice(int compChoice) {
        this.compChoice = compChoice;
    }
    //compute
    public void compareMoves() {

        if (userChoice == 0) {
            if (compChoice == 0) {
                result = " You both chose Rock, It's a draw!";
            } else if (compChoice == 1) {
                result = " You chose Rock, the Computer chose Paper. \n Paper wraps rock, You lose!";
            } else if (compChoice == 2) {
                result = "You chose Rock, the Computer chose Scissors. \n Rock breaks scissors, You Win!!";
            }
        } else if (userChoice == 1) {
            if (compChoice == 0) {
                result = " You chose Paper, the Computer chose Rock. \n Paper wraps rock, You Win!!";
            } else if (compChoice == 1) {
                result = " You both chose Paper, It's a draw!";
            } else if (compChoice == 2) {
                result = " You chose paper, the Computer chose Scissors. \n Scissors cuts paper. You lose!";
            }
        } else if (userChoice == 2) {
            if (compChoice == 0) {
                result = " You chose Scissors, the Computer chose Rock. \n Rock breaks scissors, You lose!";
            } else if (compChoice == 1) {
                result = " You chose Scissors, the Computer chose Paper. \n Scissors cuts paper, you Win!!";
            } else if (compChoice == 2) {
                result = " You both chose Scissors, It's a draw!";
            }
        } else {
            result = " That is an incorrect selection...";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    //get
    public String getResult() {
        return result;
    }
}
