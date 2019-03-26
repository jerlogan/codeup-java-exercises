package restaurant;

public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish();
        dish.setNameOfDish("Spaghetti");
        System.out.println(dish.getNameOfDish());
        dish.setCostInCents(300);
        System.out.println(dish.getCostInCents());
        dish.setWouldRecommend(false);
        System.out.println(dish.getWouldRecommend());
        dish.letsEat();






//        dish.costInCents = 300;
//        dish.wouldRecommend = true;
//        System.out.printf("%n %s, %d, %b %n %n", dish.nameOfDish, dish.costInCents, dish.wouldRecommend);
//        dish.eat();
    }
}
