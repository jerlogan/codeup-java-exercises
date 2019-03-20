public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

        int z = 0;
        do {
            System.out.println(z);
            z +=2;
        } while(z < 99);
        do {
            System.out.println(z);
             z -= 5;
        } while (z > -11);


    }
}
