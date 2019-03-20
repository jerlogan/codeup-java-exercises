import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of %s is approximately 3.14.", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer!");
        int userIntegerInput = scanner.nextInt();
        System.out.format("You entered %s", userIntegerInput);

        System.out.println("Enter three words!");
        String wordOne = scanner.next();
        String wordTwo = scanner.next();
        String wordThree = scanner.next();

        System.out.println(wordOne);
        System.out.println(wordTwo);
        System.out.println(wordThree);

        System.out.println("Enter a sentence you filthy animal!");
        String userSentence = scanner.nextLine();
        System.out.printf("You just said %s", userSentence);

        System.out.println("Enter the length of your classroom.");
        String length = scanner.nextLine();
        System.out.println("Great! Now enter the width of your classroom.");
        String width = scanner.nextLine();
        System.out.println("Almost done!! Enter the height of your classroom.");
        String height = scanner.nextLine();
        System.out.printf("The length is %s, the width is %s, and the height is %s", length, width, height);
        System.out.println(".");

        double lengthAsDouble = Double.parseDouble(length);
        double widthAsDouble = Double.parseDouble(width);
        double heightAsDouble = Double.parseDouble(height);

        double perimeter = (lengthAsDouble * 2) + (widthAsDouble * 2);
        double area = lengthAsDouble * widthAsDouble;
        double volume = lengthAsDouble * widthAsDouble * heightAsDouble;

        System.out.printf("The perimeter of your classroom is %s ft. The area of your classroom is %s ft. The volume of our classroom is %s ft.", perimeter, area, volume);
    }
}


