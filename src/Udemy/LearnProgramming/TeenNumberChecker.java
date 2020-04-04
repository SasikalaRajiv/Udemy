package Udemy.LearnProgramming;

public class TeenNumberChecker {
    public static void main(String[] args){
        System.out.println(hasTeen(22,23,34));
    }
    public static boolean hasTeen(int num1, int num2, int num3){
        boolean teen=false;
        String newNum1 =String.valueOf(isTeen(num1));
        String newNum2 =String.valueOf(isTeen(num2));
        String newNum3 =String.valueOf(isTeen(num3));
        if((newNum1.equalsIgnoreCase("true")||(newNum2.equalsIgnoreCase("true")
                ||(newNum3.equalsIgnoreCase("true")))))
        {
            teen=true;
        }
        return teen;
    }

    public static boolean isTeen(int num){
        boolean isteen=false;
        if(num>=13&&num<=19){
            isteen=true;
        }
        return isteen;
    }
}
