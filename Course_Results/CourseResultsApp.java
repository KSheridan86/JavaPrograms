/*
Ken Sheridan
CourseResultsApp.java
09/03/23
*/

// Application to compute the average results for each year of a course and the total average of all results
import java.util.*;
public class CourseResultsApp {
    public static void main(String[] args) {
        // Vars
        int totalResultsRecorded = 0;
        int result;
        // Objects
        CourseResults courseResults = new CourseResults();
        Scanner scanner = new Scanner(System.in);
        // Inputs
        for (int year = 1; year <= 4; year++) {
            System.out.println("\nEnter results for year " + year + ":");
            for (int subject = 1; subject <= 5; subject++) {
                System.out.print("Subject " + subject + ": ");
                result = scanner.nextInt();
                totalResultsRecorded++;
                courseResults.setResults(year, subject, result);
            }
        }
        // Set 
        courseResults.setTotalResultsRecorded(totalResultsRecorded);
        // Compute & Outputs
        System.out.println();
        for (int year = 1; year <= 4; year++) {
            System.out.println("Year " + year + " average: " + courseResults.computeYearAverage(year));
        }
        System.out.println("\nTotal average: " + courseResults.computeTotalAverage() + "\n");
        scanner.close();
    }
}