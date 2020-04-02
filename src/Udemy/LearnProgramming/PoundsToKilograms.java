package Udemy.LearnProgramming;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of pounds:");
        double Pounds = input.nextDouble();
        double Kilograms = Pounds * 0.45359237d;
        System.out.println(Pounds+" pound is equal to "+ Kilograms +" kilograms");
    }
}
