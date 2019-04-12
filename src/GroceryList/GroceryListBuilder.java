package GroceryList;
import java.util.*;
import util.Input;

public class GroceryListBuilder {

    ArrayList<String> groceries = new ArrayList<>();



    public void getCategory () {
        
    }


    public void displayThreePrompts() {

    }







    public static void main(String[] args) {
        System.out.println("Would you like to create a grocery list? yes | no\n");
        Scanner scanner = new Scanner(System.in);
        if (scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("Would you like to enter a new  item? yes | no \n");
            if (scanner.next().equalsIgnoreCase("yes")) {
//                displayThreePrompts();
            }
        }
        System.out.println("ok, your loss pal.");
    }

}

