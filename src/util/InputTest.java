package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("What is your name?");
        String name = input.getString();
        System.out.println("Do you like sushi?");
        boolean likesSushi = input.yesNo();
        System.out.println("How old are you?");
        int age = input.getInt(1, 100);
        System.out.println("What is 5 divided by 2?");
        double answer = input.getDouble();

        System.out.printf("OK, %s...when I asked if you liked sushi you said %b. You said you are " + age + " years old. You said that 5 divided by 2 is " + answer + " which is.....WRONG!", name, likesSushi);

        System.out.println("Play again?");
        boolean playAgain = input.yesNo();
        System.out.println(playAgain);
    }
}
