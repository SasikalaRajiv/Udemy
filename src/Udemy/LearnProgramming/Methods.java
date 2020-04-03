package Udemy.LearnProgramming;

import javax.swing.text.Position;
import java.util.Scanner;

public class Methods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int Score = input.nextInt();
        String PlayerName = input.next();
        int Position = CalculateHighScorePosition(Score);
        DisplayHighScorePosition(PlayerName,Position);
    }
    public static void DisplayHighScorePosition(String PlayerName, int Position){
        System.out.println(PlayerName+" has managed to get into position "+Position+" on the high score table");
    }
    public static int CalculateHighScorePosition(int Score){
        int Position=4;
        if(Score>=1000)
            Position= 1;
        else if(Score>=500)
            Position= 2;
        else if(Score>=100)
            Position=3;
        return Position;
    }
}
