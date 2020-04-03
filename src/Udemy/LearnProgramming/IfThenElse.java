package Udemy.LearnProgramming;

import java.util.Scanner;

public class IfThenElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of scores you want to check:");
        int ScoreEntries = input.nextInt();
        for (int i=1; i<=ScoreEntries;i++) {
            System.out.println("Enter the status of Game:");
            boolean isGameOver = input.nextBoolean();
            System.out.println("Enter the Score:");
            int Score = input.nextInt();
            System.out.println("Enter the level completed:");
            int LevelCompleted = input.nextInt();
            System.out.println("Enter the bonus points earned:");
            int BonusPoints = input.nextInt();
            if (isGameOver) {
                int FinalScore = Score + (LevelCompleted * BonusPoints);
                System.out.println("Your final score is: " + FinalScore);
            }
            else {
                System.out.println("Continue to next level");
            }
        }

    }
}
