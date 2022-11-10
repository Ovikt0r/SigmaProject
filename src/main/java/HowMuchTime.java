import java.util.ArrayList;
import java.util.List;

public class HowMuchTime {


    public static void main(String[] args) {
        System.out.println(plusPlusTask());
        System.out.println(plusEqualsTask());
    }


    public static double plusPlusTask() {
        int n = 0;
        List<Integer> integerList = new ArrayList<>();
        int rightNumber = 874;
        long m = System.currentTimeMillis();
        for (int i = 920000000; i < 929999999; i++) {
            if (i % rightNumber == 0) {
                n = i / rightNumber;
                integerList.add(n);
            }
        }
        return (double) (System.currentTimeMillis() - m);
    }

    public static double plusEqualsTask() {
        int n = 0;
        List<Integer> integerList = new ArrayList<>();
        int rightNumber = 874;
        long t = System.currentTimeMillis();
        for (int i = 920000000; i < 929999999; i += 2) {
            if (i % rightNumber == 0) {
                n = i / rightNumber;
                integerList.add(n);
            }
        }
        long t1 = System.currentTimeMillis();
        //код
        return (double) (System.currentTimeMillis() - t1);

    }
}
