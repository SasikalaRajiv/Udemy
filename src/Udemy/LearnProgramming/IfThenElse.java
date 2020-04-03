package Udemy.LearnProgramming;

import java.util.Scanner;

public class IfThenElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isGameOver = input.nextBoolean();
        int Score = input.nextInt();
        int LevelCompleted = input.nextInt();
        int BonusPoints = input.nextInt();
        CalculateFinalScore(isGameOver,Score,LevelCompleted,BonusPoints);
    }
        public static void CalculateFinalScore(boolean isGameOver, int Score,int LevelCompleted,int BonusPoints){
            if (isGameOver) {
                int FinalScore = Score + (LevelCompleted * BonusPoints);
                System.out.println("Your final score is: " + FinalScore);
            }
            else {
                System.out.println("Continue to next level");
            }
        }
        }


