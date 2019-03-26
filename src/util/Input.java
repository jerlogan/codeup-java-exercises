package util;
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
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        scanner.next();
        System.out.println("Enter an integer you bastard!");
        return getInt();
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
        return scanner.nextDouble();
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

//    public int getInt(int min, int max) {
//
//    }

}

