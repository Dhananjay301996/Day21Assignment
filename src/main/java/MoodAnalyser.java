import java.util.Scanner;

/**
 * Mood analyser program
 */

public class MoodAnalyser {
    String message;

    public MoodAnalyser() {

    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        return analyseMood(message);
    }

    public String analyseMood(String message) {
        String split[] = message.split(" ");

        String messageToReturn = "";

        for (String var : split) {
            if (var.equalsIgnoreCase("Sad")) {
                messageToReturn = var;
                break;
            } else if (var.equalsIgnoreCase("Happy")) {
                messageToReturn = var;
                break;
            }
        }

        if (messageToReturn.equals("")) {
            return "Happy";
        }

        return messageToReturn;
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
