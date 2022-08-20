import java.util.Scanner;

/**
 * Mood analyser program
 */

public class MoodAnalyser {
    String message;
    MoodAnalyser(){

    }

    MoodAnalyser(String msg){
        this.message = message;
    }
    String analyseMood(){
        return analyseMood(message);
    }
    String analyseMood(String message){
        String stringArray[] = message.split(" ");
        String result = " ";

        try {
            for (String var : stringArray) {
                if (var.equalsIgnoreCase("happy")) {
                    result = "Happy";
                    break;
                } else if (var.equalsIgnoreCase("sad")) {
                    result = "Sad";
                    break;
                }
            }
        } catch (NullPointerException e){
            result = "Happy";
        }

        if(result.equals(" ")){
            result = "Happy";
        }

        return result;
    }
/*
call all method in main method
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String HowsMood = sc.next();
        MoodAnalyser mood = new  MoodAnalyser();
        String Mood = mood.analyseMood(HowsMood);
        System.out.println("Your mood is "+Mood);

    }

}
