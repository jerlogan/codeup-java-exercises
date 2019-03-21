import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        for (int i = 5; i <=15; i++) {
            System.out.println(i);
        }
        for (int z = 0; z < 101; z+=2) {
            System.out.println(z);
        }
        for (int x = 100; x > -11; x-=5) {
            System.out.println(x);
        }


        for (long y = 2; y <= 1000000; y *= y) {
            System.out.println(y);
        }


        for (int s = 1; s <= 100; s++) {
            if (s % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (s % 5 == 0) {
                System.out.println("Buzz");
            }
            else if (s % 15 == 0) {
                System.out.println("FizzBuzz");
            }
            else {
                System.out.println(s);
            }
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        String userString = scanner.next();
        System.out.println("Great! You have entered " + userString);

        int userNumber = Integer.parseInt(userString);

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userNumber; i++) {

            int numSquared = i * i;
            int numCubed = i * i * i;

            System.out.println(i + "      |  " + numSquared + "      |  " + numCubed + "     ");
        }


        System.out.println("What is little Jimmy's grade (from 0 to 100)?");
        String userString2 = scanner.next();
        int userNumber2 =  Integer.parseInt(userString2);
        char grade;
        if (userNumber2 >= 88) {
            grade = 'A';
            System.out.println(grade);
        }
        if (userNumber2 >= 80 && userNumber <= 87) {
            grade = 'B';
            System.out.println(grade);
        }
        if (userNumber2 >= 67 && userNumber <= 79) {
            grade = 'C';
            System.out.println(grade);
        }
        if (userNumber2 >= 60 && userNumber <= 66) {
            grade = 'D';
            System.out.println(grade);
        }
        else if (userNumber2 >= 0 && userNumber <= 59) {
            grade = 'F';
            System.out.println(grade);
        }

        System.out.println("Hit enter to continue.");
    }
}
