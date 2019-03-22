public class MethodsExercises {
    private static int addInts (int int1, int int2) {
        return int1 + int2;
    }
    private static int subtractInts (int int1, int int2) {
        return int1 - int2;
    }
    private static int multiplyInts (int int1, int int2) {
        int product = 1;
        for (int i = 1; i <= int2; i++) {
            product = i * int1;
        }
        return product;
    }

    private static double divideInts (double num1, double num2) {
        return num1 / num2;
    }
    private static int findModulus (int num1, int num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        System.out.println(addInts(4, 6));
        System.out.println(subtractInts(10, 3));
        System.out.println(multiplyInts(3, 6));
        System.out.println(divideInts(8, 0));
        System.out.println(findModulus(25, 9));
        System.out.println("Enter a number between 1 and 10:");

    }

    public static int getInteger(int min, int max) {

    }

}
