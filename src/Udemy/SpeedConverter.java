package Udemy;

public class SpeedConverter {

//  convert kph to mph

    private static long toMilesPerHour(double kilometersPerHour) {
        double milesPerHour = (kilometersPerHour / 1.609);
        long mphRounded = Math.round(milesPerHour);
        if (kilometersPerHour < 0)
            return -1;
        else
            return mphRounded;
    }

// print conversion

    public static void PrintConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0)
            System.out.println("Invalid value");
        else
        System.out.println(kilometersPerHour + "km/h = " + toMilesPerHour(kilometersPerHour) +
                "mi/h");
    }

    public static void main(String[] args) {
        PrintConversion(10.25);
    }


}
