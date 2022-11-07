

public class Main {
    public static void main(String[] args) {

        int coreNumber = 35;
        int divider = 15;
        System.out.println("Multiple Digits");
        for (int i = coreNumber * 10; i < 10000; i++) {
            if (i % divider == 0 && ((i - i / 1000 * 1000) / 10) == coreNumber) {
                System.out.println(i);
            }
        }

        int rightNumber = 874;
        System.out.println(92 + "abc" + " = " + rightNumber + "x");
        System.out.println("x:");
        for (int i = 92000; i < 92999; i++) {
            if (i % rightNumber != 0) {
                System.out.println("["+ (i % rightNumber) +"]");
            }
        }
    }}
//        final int RANGE = 200;
//        final int DEVIDER = 49;
//        for (int a = 0; a < RANGE; a++) {
//            for (int b = 0; b < RANGE; b++) {
//                if ((a * a + b * b) % DEVIDER == 0) {
//                    System.out.println("a=" + a + " b=" + b);
//                }
//            }
//        }
//
//
//        int max = 0;
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    int currentValue = i * 100 + j * 10 + k - i * i * i - j * j * j - k * k * k;
//                    if (currentValue > max) {
//                        max = currentValue;
//                    }
//                }
//            }
//        }
//        System.out.println(max);
//
//        int count = 0;
//        for (int a = 1; a < 10; a++) {
//            for (int b = 0; b < 10; b++) {
//                for (int c = 1; c < 10; c++) {
//                    if (c != a) {
//                        count++;
//                    }
//                }
//            }
//        }
//        System.out.println(count);
//    }
//}