package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        // Creates an array of test scores
        int[] testScores = {38, 59, 98, 23, 80, 76, 85, 65, 90, 47};

        int total = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];
        double median;

        // Loops through the array find the total, high score, and low score
        for (int testScore : testScores) {
            total += testScore;
            if (testScore > highScore) {
                highScore = testScore;
            } else if (testScore < lowScore) {
                lowScore = testScore;
            }

        }
        // Sorts the array then calculates the median depending on array length
        Arrays.sort(testScores);
        if (testScores.length %2 != 0){
            median = testScores[(testScores.length/2)];
        }
        else {
            int middle1 = testScores.length/2 - 1;
            int middle2 = testScores.length/2;
            median = (double) (testScores[middle1] + testScores[middle2]) /2;
        }

        // Calculates the average then prints average, median, high score, and low score
        double average = (double) total / testScores.length;
        System.out.println("The average is " + average);
        System.out.println("The highest score is " + highScore);
        System.out.println("The lowest score is " + lowScore);
        System.out.println("The median is " + median);
    }

}
