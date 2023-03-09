/*
Ken Sheridan
CourseResultsApp.java
09/03/23
*/

// import java.util.Scanner;

// public class CourseResultsApp {
//     public static void main(String[] args) {
//         // Vars
//         CourseResults courseResults = new CourseResults();
//         // Objects
//         Scanner keyboard = new Scanner(System.in);
//         // Inputs
//         System.out.println(
//             "\nLet's work out your average results for the course...\nYou'll need to enter the results you've gotten for each of your 5 subjects, \nIn each of the 4 academic years.\n");
//         for (int year = 0; year < 4; year++) {
//             System.out.println("\nEnter results for year " + (year+1) + ":");
//             for (int i = 0; i < 5; i++) {
//                 System.out.print("Subject " + (i+1) + " result: ");
//                 courseResults.addResult(year, keyboard.nextInt());
//             }
//         }
//         // Outputs
//         System.out.print("\n");
//         for (int year = 0; year < 4; year++) {
//             System.out.println("Average for year " + (year+1) + ": " + courseResults.getYearAverage(year));
//         }

//         System.out.println("\nTotal average: " + courseResults.getTotalAverage() + "\n");
//         keyboard.close();
//     }
// }

import java.util.Scanner;

public class CourseResultsApp {
    public static void main(String[] args) {
        // Create a new instance of the CourseResults class
        CourseResults courseResults = new CourseResults();
        
        // Create a new scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter results for each year and subject
        for (int year = 1; year <= 4; year++) {
            System.out.println("Enter results for year " + year + ":");
            for (int subject = 1; subject <= 5; subject++) {
                System.out.print("Subject " + subject + ": ");
                int result = scanner.nextInt();
                courseResults.setResult(year, subject, result);
            }
        }
        
        // Print the average for each year
        for (int year = 1; year <= 4; year++) {
            System.out.println("Year " + year + " average: " + courseResults.getYearAverage(year));
        }
        
        // Print the total average
        System.out.println("Total average: " + courseResults.getTotalAverage());
        
        // Close the scanner object
        scanner.close();
    }
}