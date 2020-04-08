package Udemy.LearnProgramming;

public class PlayingCat {
    public static void main(String[] args){
        System.out.println(isCatPlaying(true,46));
    }
    public static boolean isCatPlaying(boolean summer, int temp){
        boolean isPlaying =false;
         if((summer==true)&&(temp>=25&&temp<=45)){
              isPlaying = true;
        } else if (temp>=25 && temp <=35) {
             isPlaying=true;
         }
         return isPlaying;
    }
}
