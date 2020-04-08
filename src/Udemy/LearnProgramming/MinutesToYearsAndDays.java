package Udemy.LearnProgramming;

import com.sun.jdi.Value;

public class MinutesToYearsAndDays {
    public static void main(String[] args){
        printYearsAndDays(0);
    }
    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
        } else{
            long actualdays = (minutes/60)/24;
            long years = actualdays/365;
            long days = ((minutes/60)%24) + actualdays%365;
            System.out.println(minutes+" min"+" = "+years+" y "+"and "+days+" d");
        }
    }
}
