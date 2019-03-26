package Burgers;

public class BurgerTester {
    public static void main(String[] args) {
        BurgerTools test1 = new BurgerTools();
        System.out.println(test1.mostPopularTopping);
        test1.setExpiration(30);
        System.out.println(test1.averageDaysBeforeExpiration);
    }
}
