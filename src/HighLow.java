import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class HighLow {

    public static long randNum = Math.round(Math.floor(Math.random() * 100 + 1));

    public static long guessNumber() {
        char userContinue;
        Scanner guessScanner = new Scanner(System.in);
        System.out.println("I have picked a random number between 1 and 100...can you guess it?");
        long userGuess = guessScanner.nextLong();

        if (userGuess >= 1 && userGuess <= 100) {
            if (userGuess == randNum) {
                System.out.println("GOOD GUESS!");
            } else if (userGuess > randNum) {
                System.out.println("LOWER");
            } else if (userGuess < randNum) {
                System.out.println("HIGHER");
            }
        } else {
            System.out.println("Enter a number between 1 and 100 you dweeb!");
        }
        return randNum;
    }




    public static void main(String[] args) {
        Scanner guessScanner = new Scanner(System.in);
        boolean userContinue = true;
        do {
            System.out.println(randNum);
            guessNumber();
        } while(userContinue);



    }
}
