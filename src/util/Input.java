package util;
import java.math.BigInteger;
import java.util.Scanner;



public class Input {
    private Scanner scanner;
    public Input () {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        return scanner.nextLine();
    }
    public boolean yesNo() {
        String input = scanner.next();
        return input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes");

    }
    public int getInt () {
        String string;
        try {
            string = scanner.next();
            return Integer.valueOf(string);
        } catch (NumberFormatException e) {
            System.out.println("Enter an integer you bastard!");
            return getInt();
        }
    }
    public int getInt(int min, int max) {
        int userInt = getInt();
        if (userInt >= min && userInt <= max) {
            return userInt;
        }
        else {
            return getInt(min, max);
        }
    }
    public double getDouble () {
        String string;
        try {
            string = scanner.next();
            return Integer.valueOf(string);
        } catch (NumberFormatException e) {
            System.out.println("Enter a double you friggin idiot- Napoleon Dynamite");
            return getDouble();
        }
    }

    public double getDouble (double min, double max) {
        double userDouble = getDouble();
        if (userDouble >= min && userDouble <= max) {
            return userDouble;
        }
        else {
            return getDouble(min, max);
        }
    }

    public double getBinary () {
        double binaryToDouble;
        try {
            String string = scanner.nextLine();
            binaryToDouble = Double.longBitsToDouble(new BigInteger(string, 2).longValue());
            return binaryToDouble;
        } catch (Exception e) {
            System.out.println("Your number isn't binary bruh.");
            return getBinary();
        }
    }

//    public int getInt(int min, int max) {
//
//    }

}

