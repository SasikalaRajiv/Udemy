package Udemy.LearnProgramming;

public class BarkingDog {
    public static void main(String[] args){
        System.out.println(shouldWakeUp(true,-1));
    }
    public static boolean shouldWakeUp(boolean isBarking,int hourOfDay){
        boolean WakeUP=false;
        if(hourOfDay<0){
            return WakeUP;
        }
        else if((isBarking)&&((hourOfDay<8)||(hourOfDay==23))){
            WakeUP=true;
        }
        return WakeUP;
    }
}
