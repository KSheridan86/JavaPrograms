/*
Ken Sheridan
Dashes.java
09/03/2023
*/

// Program to print 10 dashes on 10 lines
public class Dashes {
    public static void main(String[] args) {
        // Vars
        char[][] dashes = new char[10][10];
        // Process & Output, populate the array with dashes and print it out
        for (int i = 0; i < dashes.length; i++) {
            for (int j = 0; j < dashes[i].length; j++) {
                dashes[i][j] = '-';
                System.out.print(dashes[i][j]);
            }
            System.out.println();
        }
    }
}