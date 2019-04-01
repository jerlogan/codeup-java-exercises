import java.util.Scanner;

public class ServerNameGenerator {
    public static String[] adjectives = {"harry", "ugly", "cool", "scary", "gentle", "sleepy", "grumpy",
    "pretty", "fat", "tiny"};
    public static String[] nouns = {"squirrel", "vacation", "girl", "boy", "mountain", "puppy", "goat",
    "man", "woman", "grandma"};


    public static String randomAdjective () {
            int randomAdjNumber = (int)Math.floor(Math.random() * adjectives.length);
            return adjectives[randomAdjNumber];
    }

    public static String randomNoun () {
        int randomNounNumber = (int)Math.floor(Math.random() * nouns.length);
        return nouns[randomNounNumber];
    }


    public static void main(String[] args) {
        String newName;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.printf("Your server name is: %n" +
                    "%s %s %n %n", randomAdjective(), randomNoun());
            System.out.println("New name? Y | N");
            newName = scanner.next();
        } while (newName.equals("Y") || newName.equals("y"));
    }


}
