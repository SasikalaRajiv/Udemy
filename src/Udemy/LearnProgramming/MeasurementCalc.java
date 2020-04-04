package Udemy.LearnProgramming;

public class MeasurementCalc {
    public static void main(String[] args){
        System.out.println(calcFeetAndInchesToCentimeters(0));
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet<0) && (inches<0&&inches>12)){
       return -1;
        }
        double Centimeters = 12*2.54*feet;
        Centimeters+=inches*2.54;
        return Centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches<0){
           return -1;
        }
        double inchesInFeet= (int)inches/12;
        double remainingInches = inches%12;
        return calcFeetAndInchesToCentimeters(inchesInFeet,remainingInches);
    }
}
