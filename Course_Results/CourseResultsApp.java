/*
Ken Sheridan
CourseResultsApp.java
08/03/23
*/

import java.util.Scanner;

public class CourseResultsApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CourseResults courseResults = new CourseResults();
        System.out.println(
            "\nLet's work out your average results for the course...\nYou'll need to enter the results you've gotten for each of your 5 subjects, \nIn each of the 4 academic years.\n");
        for (int year = 0; year < 4; year++) {
            System.out.println("\nEnter results for year " + (year+1) + ":");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i+1) + " result: ");
                courseResults.addResult(year, keyboard.nextInt());
            }
        }
        System.out.print("\n");
        for (int year = 0; year < 4; year++) {
            System.out.println("Average for year " + (year+1) + ": " + courseResults.getYearAverage(year));
        }

        System.out.println("\nTotal average: " + courseResults.getTotalAverage() + "\n");
        keyboard.close();
    }
}