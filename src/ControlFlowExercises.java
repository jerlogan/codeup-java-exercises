import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ControlFlowExercises {
    public static void main(String[] args) {

        for (int i = 5; i <=15; i++) {
            System.out.println(i);
        }
        for (int z = 0; z < 101; z+=2) {
            System.out.println(z);
        }
        for (int x = 100; x > -11; x-=5) {
            System.out.println(x);
        }
        for (int w = 2; w < 1000000; w++) {
            int v = w * w;

            System.out.println(v * v);
            if (v >= 1000000) {
                break;
            }
        }




    }
}
