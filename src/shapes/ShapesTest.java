package shapes;

public abstract class ShapesTest {
    public static void main(String[] args) {

        Measurable myShape1 = new Square(5);
        Measurable myShape2 = new Rectangle(4, 6);

        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
        System.out.println(((Square) myShape1).getLength());
    }
}
