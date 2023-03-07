package AverageApp;
/*
Ken Sheridan
AverageApp.java
07/03/2023
*/
import java.util.*;

// Application to calculate the average of five numbers
public class AverageApp {
    public static void main(String[] args) {
        // Set up array
        double[] arr = new double[5];
        // Objects
        double sum = 0;
        double avg = 0;
        Scanner keyboard = new Scanner(System.in);
        // Input & Process
        System.out.println("Enter five numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Number " + (i+1) + ": ");
            arr[i] = keyboard.nextDouble();
            sum += arr[i];
        }
        // Output
        avg = sum / arr.length;
        System.out.println("The average is: " + avg);
        keyboard.close();
    }
}


// public class AverageApp {
//     public static void main(String[] args) {
//         // Set up array
//         double arr[] ;
//         arr = new double[5];
//         // Objects
//         double sum = 0;
//         double avg = 0;
//         Scanner keyboard = new Scanner(System.in);
//         // Input
//         System.out.println("\nEnter five numbers:\n");
//         for (int i = 0; i < 5; i++) {
//             System.out.print("Number " + (i+1) + ": ");
//             arr[i] = keyboard.nextDouble();
//         }
//         // Process
//         for (int i = 0; i < arr.length; i++) {
//             sum += arr[i];
//         }
//         // Output
//         avg = sum / arr.length;
//         System.out.println("\nThe average is: " + avg + "\n");
//         keyboard.close();
//     }
// }