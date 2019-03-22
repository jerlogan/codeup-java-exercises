import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean bobStillTalking = true;

       do {
           String userQuestion = scanner.nextLine();

           if (userQuestion.endsWith("?")) {
               System.out.println("Sure...");
           } else if (userQuestion.endsWith("!")) {
               System.out.println("Whoa! Chill out!");
           } else if (userQuestion.length() == 0) {
               System.out.println("FINE! Be that way!");
           } else {
               System.out.println("Whatever.");
           }
       } while (bobStillTalking);
    }
}
