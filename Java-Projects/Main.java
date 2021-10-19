import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing current song");
            System.out.println("would you liek to take this song o ff of repeat? if so, answe ryes");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;

            }
        }
        System.out.println("playing next song yerrr");
    }
}
