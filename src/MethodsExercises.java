import java.util.Random;
import java.util.Scanner;

public class MethodsExercises {
    private static int addInts (int int1, int int2) {
        return int1 + int2;
    }
    private static int subtractInts (int int1, int int2) {
        return int1 - int2;
    }
    private static int multiplyInts (int int1, int int2) {
        int product = 1;
        for (int i = 1; i <= int2; i++) {
            product = i * int1;
        }
        return product;
    }

    private static double divideInts (double num1, double num2) {
        return num1 / num2;
    }
    private static int findModulus (int num1, int num2) {
        return num1 % num2;
    }

//    Calculate the factorial of a number.

    private static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 and 10:");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max) {
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
        return 0;

    }

    //Calculate the factorial of a number.

    private static int factorial() {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 10:");
            int userInteger = scanner.nextInt();


            if (userInteger >= 1 && userInteger <= 10) {
                int result = 1;
                for (int i = 1; i <= userInteger; i++) {
                    result *= i;
                }
                return result;
            } else {
                System.out.println(factorial());
                return userInteger;
            }
    }

//    Create an application that simulates dice rolling.

    public static String rollDice() {
        char rollDice;
        Scanner diceScanner = new Scanner(System.in);
        System.out.println("How many sides are on the dice?");
        int numberSides = diceScanner.nextInt();
        System.out.printf("Great! There are " + numberSides + " sides to each of your dice.");
        System.out.println();
        System.out.println("Now time to roll the dice!");
        System.out.println("Hit any key to roll the dice");
        rollDice = diceScanner.next().charAt(0);
        do {
            System.out.println("Rolling the dice...");
            double randNumber1 = Math.random() * numberSides + 1;
            double randNumber2 = Math.random() * numberSides + 1;
            long randNumRounded1 = Math.round(Math.floor(randNumber1));
            long randNumRounded2 = Math.round(Math.floor(randNumber2));
            System.out.printf("The dice numbers are " + randNumRounded1 + " and " + randNumRounded2 + "!" );
        }while(rollDice == 'q');
        System.out.println();
        return "great job";
    }


    //Call all of our methods

    public static void main(String[] args) {
        char userContinue;
        char userRollAgain;
        Scanner scanner = new Scanner(System.in);
//        System.out.println(addInts(4, 6));
//        System.out.println(subtractInts(10, 3));
//        System.out.println(multiplyInts(3, 6));
//        System.out.println(divideInts(8, 0));
//        System.out.println(findModulus(25, 9));
//        getInteger(1, 10);

//        get factorial

//        do {
//            factorial();
//            System.out.println("Continue? Y | N");
//            userContinue = scanner.next().charAt(0);
//        } while (userContinue == 'y' || userContinue == 'Y');
//
////        roll dice
//
//        do {
//            rollDice();
//            System.out.println("Continue? Y | N");
//            userRollAgain = scanner.next().charAt(0);
//        } while (userRollAgain == 'y' || userRollAgain == 'Y');

    }






}
