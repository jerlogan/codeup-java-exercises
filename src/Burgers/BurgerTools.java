package Burgers;

public class BurgerTools {
    public String mostPopularTopping = "cheese";
    public static int averageDaysBeforeExpiration;
    public static int temperatureWhenCooked;
    public void grill() {
        System.out.println("Grilling burger");
    }

    public void setExpiration (int expiration) {
        averageDaysBeforeExpiration = expiration;
    }
}
