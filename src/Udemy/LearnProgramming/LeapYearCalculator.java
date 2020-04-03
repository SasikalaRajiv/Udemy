package Udemy.LearnProgramming;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeap = true;
                    } else {
                        return isLeap;
                    }
                } else {
                    isLeap = true;
                }
            }
            return isLeap;
        }
        return isLeap;
    }
}