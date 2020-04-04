package Udemy.LearnProgramming;

public class DecimalComparator {
    public static void main(String[] args){
        System.out.println(areEqualByThreeDecimalPlaces(3.0,3.0));
    }
    public static boolean areEqualByThreeDecimalPlaces(double Num1, double Num2) {
        boolean isdecimal = false;
        Num1 = Num1*1000;
        Num2 = Num2*1000;
        int newNum1 = (int) Num1;
        int newNum2 = (int) Num2;
        if(newNum1==newNum2){
            isdecimal=true;
        }
        return isdecimal;
    }
}
        /*int count =0;
        String newNum1 = String.valueOf(Num1);
        newNum1 = newNum1.substring(newNum1.indexOf('.'));
        int length1 = newNum1.length();
        String newNum2 = String.valueOf(Num2);
        newNum2 = newNum2.substring(newNum2.indexOf('.'));
        int length2 = newNum2.length();
        int n = (length1>=length2)? length2:length1;
        for (int i=0;i<=n-1;i++){
            int x = (int)newNum1.charAt(i);
            int y = (int)newNum2.charAt(i);
            if(i<=3 && x==y){
                count++;
                if(n<=2&&x==y){
                    isdecimal=true;
                    break;
                }
                continue;
            }
        }
        if(count==4)
            isdecimal=true;*/

