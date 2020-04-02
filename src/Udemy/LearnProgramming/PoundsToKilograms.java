package Udemy.LearnProgramming;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pounds:");
        int Pounds = input.nextInt();
        double Kilograms = Pounds * 0.45359237;
        System.out.println(Pounds+" pound is equal to "+ Kilograms +" kilograms");
    }
}
