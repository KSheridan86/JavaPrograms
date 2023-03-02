package Numbers;
/*
NumbersApp.java
Ken Sheridan
02/03/23
*/

import javax.swing.JOptionPane;
public class NumbersApp {
    public static void main(String[] args) {
        // Vars
        int[] initialNumbers = new int[3];
        int[] finalNumbers;
        // Declare Objects
        Numbers n;
        n = new Numbers();
        // Input
        for (int i = 0; i < initialNumbers.length; i++) {
            initialNumbers[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
        }
        // Set
        n.setInitialNumbers(initialNumbers);
        // Compute
        n.computeFinalNumbers();
        // Get
        finalNumbers = n.getFinalNumbers();
        // Output
        for (int i = 0; i < initialNumbers.length; i++) {
            JOptionPane.showMessageDialog(null, initialNumbers[i]+ " times 9 is " + finalNumbers[i]);
        }   
    }
}
