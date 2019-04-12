package shapes;
import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        boolean makeAnotherCircle;
        do {
            Input input = new Input();
            Circle circle = new Circle();
            System.out.println("Enter the radius of your circle.");
            double circleRadius = input.getDouble();
            double circleArea = circle.getArea(circleRadius);
            double circleCircumference = circle.getCircumference(circleRadius);


            System.out.println("Your radius is " + circleRadius + ". Your area is " + circleArea + ". Your circumference " +
                    "is " + circleCircumference + ".");
            System.out.println();

            System.out.println("Would you like to make another circle?");

            makeAnotherCircle = input.yesNo();
            System.out.println(makeAnotherCircle);

        } while(makeAnotherCircle);
    }
}
