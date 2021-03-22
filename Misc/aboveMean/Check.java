import java.util.ArrayList;
import java.util.Arrays;

public class Check {

    public static int checkAboveMean(double[] arr) {

        double total = 0;
        for (double n : arr) {
            total += n;
        }

        double avg = total / arr.length;

        int count = 0;
        for (double n : arr) {
            if (n > avg) {
                count++;
            }
        }

        return count;
    }

    public static void check() {

        double[] test1 = {1, 2, 3, 4, 5};
        double[] test2 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        double[] test3 = {10.5, 17.8, 9.1, 2,44};
        double[] test4 = {21.44, 15.9, 18.7, 19.4, 19.102};
        double[] test5 = {1.22, 3.4, 10.7, 8.1, 10.8};

        ArrayList<double[]> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

        int passed = 0;
        for (double[] test : tests) {

            int solution = checkAboveMean(test);
            int result = Main.aboveMean(test);

            if (solution == result) {
                System.out.println("Test: " + Arrays.toString(test) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + Arrays.toString(test) + " - failed");
            }
        }

        if (passed == tests.size()) {
            System.out.println("Solution accepted - " + passed + "/" + tests.size() + " test cases passed");
        }
        else {
            System.out.println("Solution rejected - " + passed + "/" + tests.size() + " test cases passed");
        }
    }
}
