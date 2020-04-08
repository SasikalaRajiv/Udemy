package Udemy.LearnProgramming;

public class SecondsAndMinutes {

    private static final String INVALID_STRING_MESSAGE = "INVALID VALUE";
    public static void main(String[] args){
        System.out.println(getDurationString(540));
        System.out.println(getDurationString(61,0));
    }
    private static String getDurationString(int minutes, int seconds){
        if(minutes<0 || (seconds<0&&seconds>59)){
            return INVALID_STRING_MESSAGE;
        }
        //To make your output better add if-else to display as 00h 00m 00s
        int hours = minutes/60;
        int reminingminutes = minutes%60;
        return hours+"h "+reminingminutes+"m "+seconds+"s";
    }
    private static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_STRING_MESSAGE;
        }
        int min = seconds/60;
        int remin = seconds%60;
        return getDurationString(min,remin);
    }

}
