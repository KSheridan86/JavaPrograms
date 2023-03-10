/*
Ken Sheridan
CourseResults.java
09/03/23
*/

// Application to compute the average results for each year of a course and the total average of all results
public class CourseResults {
    // Vars
    private int[][] results;
    int totalResultsRecorded = 0;
    // Constructor
    public CourseResults() {
        results = new int[5][6];
        totalResultsRecorded = 0;
    }
    // Set
    public void setResults(int year, int subject, int result) {
        this.results[year][subject] = result;
    }
    public void setTotalResultsRecorded(int totalResultsRecorded) {
        this.totalResultsRecorded = totalResultsRecorded;
    }
    // Compute
    public double computeYearAverage(int year) {
        int sum = 0;
        for (int subject = 1; subject <= 5; subject++) {
            sum += results[year][subject];
        }
        return (double) sum / 5;
    }
    public double computeTotalAverage() {
        int sum = 0;
        for (int year = 1; year <= 4; year++) {
            for (int subject = 1; subject <= 5; subject++) {
                sum += results[year][subject];
            }
        }
        return (double) sum / totalResultsRecorded;
    }
    // Get
    public int getResult(int year, int subject) {
        return results[year][subject];
    }
}