package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        // Creates an array of test scores
        int[] testScores = {38, 59, 98, 23, 80, 76, 85, 65, 90, 47};

        int total = 0;
        int highScore = testScores[0];
        int lowScore = testScores[0];

        // Loops through the array find the total, high score, and low score
        for (int testScore : testScores) {
            total += testScore;
            if (testScore > highScore) {
                highScore = testScore;
            } else if (testScore < lowScore) {
                lowScore = testScore;
            }

        }
        // Calculates the averag then prints average, high score, and low score
        double average = (double) total / testScores.length;
        System.out.println("The average is " + average);
        System.out.println("The highest score is " + highScore);
        System.out.println("The lowest score is " + lowScore);

    }
}
