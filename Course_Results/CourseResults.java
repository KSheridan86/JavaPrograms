/*
Ken Sheridan
CourseResults.java
09/03/23
*/

// public class CourseResults {
//     // Vars
//     private int[][] results;
//     // Constructor
//     public CourseResults() {
//         results = new int[4][5];
//     }
//     // Set
//     public void addResult(int year, int result) {
//         results[year][getResultIndex(year)] = result;
//     }
//     // Get
//     public int getYearAverage(int year) {
//         int sum = 0;
//         for (int i = 0; i < 5; i++) {
//             sum += results[year][i];
//         }
//         return sum / 5;
//     }

//     public double getTotalAverage() {
//         int totalSum = 0;
//         for (int year = 0; year < 4; year++) {
//             for (int i = 0; i < 5; i++) {
//                 totalSum += results[year][i];
//             }
//         }
//         return (double) totalSum / 20;
//     }
    
//     private int getResultIndex(int year) {
//         for (int i = 0; i < 5; i++) {
//             if (results[year][i] == 0) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

public class CourseResults {
    // Instance variables
    private int[][] results;
    
    // Constructor
    public CourseResults() {
        results = new int[5][6];
    }
    
    // Getter and setter methods for individual results
    public int getResult(int year, int subject) {
        return results[year][subject];
    }
    
    public void setResult(int year, int subject, int result) {
        this.results[year][subject] = result;
    }
    
    // Method to calculate the average for a given year
    public double getYearAverage(int year) {
        int sum = 0;
        for (int subject = 1; subject <= 5; subject++) {
            sum += results[year][subject];
        }
        return (double) sum / 5;
    }
    
    // Method to calculate the total average for all years and subjects
    public double getTotalAverage() {
        int sum = 0;
        for (int year = 1; year <= 4; year++) {
            for (int subject = 1; subject <= 5; subject++) {
                sum += results[year][subject];
            }
        }
        return (double) sum / 20;
    }
}
