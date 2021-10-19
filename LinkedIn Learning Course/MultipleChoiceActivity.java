import java.util.Locale;
import java.util.Scanner;

public class MultipleChoiceActivity {
    public static void main(String args[]) {
        Scanner userInput = new Scanner(System.in);
        String question = "Who is the streamer who's motto is 'VSM'?";
        String choiceOne = "a";
        String choiceTwo = "b";
        String choiceThree = "c";

        String correctAnswer = choiceThree;
        boolean repeat = true;
        System.out.println(question);
        String newline = System.getProperty("line.separator");
        System.out.println("Choices are:" + newline + choiceOne + ". NickMercs" + newline + choiceTwo + ". TimTheTatMan" + newline + choiceThree + ". Dr. Disrespect");


        String userGuess = userInput.next();
        while (repeat) {
            if (correctAnswer.equals(userGuess.toLowerCase() )) {
                System.out.println("Congrats, you got the right answer!");
                repeat = false;
            } else {
                System.out.println("Incorrect answer, please try again");
                userGuess = userInput.next();
            }
        }
    }
}
