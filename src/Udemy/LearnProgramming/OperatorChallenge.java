package Udemy.LearnProgramming;

public class OperatorChallenge {
    public static void main(String[] args){
        double myVar1 = 20d;
        System.out.println(myVar1);
        double myVar2 = 80;
        double AddVar1_Var2 = (myVar1 + myVar2)*100;
        double reminder = AddVar1_Var2 % 40;
        boolean result = (reminder==0)?true:false;
        System.out.println(result);
        if(!result)
            System.out.println("Got some reminder");

    }
}
