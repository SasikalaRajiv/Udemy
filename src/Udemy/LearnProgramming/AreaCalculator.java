package Udemy.LearnProgramming;

import java.awt.geom.Area;

public class AreaCalculator {

    public static void main(String[] args){
        System.out.println(area(8.5));
        System.out.println(area(5.0,4.0));
    }
    public static double area(double radius){
        if(radius<0){
            return -1;
        }
        return Math.PI*(radius*radius);

    }

    public static double area(double x, double y){
        if(x<0||y<0){
            return -1;
        }
        double radius = Math.sqrt((x*y)/(2*Math.PI));
        return 2*area(radius);
    }
}
