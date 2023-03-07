/*
Ken Sheridan
CourseResults.java
08/03/23
*/

public class CourseResults {
    private int[][] results;

    public CourseResults() {
        results = new int[4][5];
    }

    public void addResult(int year, int result) {
        results[year][getResultIndex(year)] = result;
    }

    public int getYearAverage(int year) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += results[year][i];
        }
        return sum / 5;
    }

    public double getTotalAverage() {
        int totalSum = 0;
        for (int year = 0; year < 4; year++) {
            for (int i = 0; i < 5; i++) {
                totalSum += results[year][i];
            }
        }
        return (double) totalSum / 20;
    }

    private int getResultIndex(int year) {
        for (int i = 0; i < 5; i++) {
            if (results[year][i] == 0) {
                return i;
            }
        }
        return -1;
    }
}
