public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Hello world...again!");

        int myFavoritenNumber = 12;
        System.out.println(myFavoritenNumber);
        String myString = "You miss 100% of the shots you don't take. - Wayne Gretzky";
        System.out.println(myString);
        float myNumber = (float) 3.14;
        System.out.println(myNumber);

        System.out.println("-----------------#10---------------");

        int x = 5;
        System.out.println(x++);
        System.out.println(x);

        System.out.println(++x);
        System.out.println(x);

        System.out.println("-----------------#12----------------");

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

        System.out.println("-----------------#13----------------");

        int a = 4;
        System.out.println(a += 5);

        int b = 3;
        int c = 4;
        System.out.println(c *= b);

        int d = 10;
        int e = 2;
        System.out.println(d /= e);
        System.out.println(e -= d);
    }
}
