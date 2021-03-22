import java.util.ArrayList;
import java.util.Arrays;

public class Check {

    public static int checkPowerSum(int a, int b) {

        int aPow = 1;
        for (int i = 0; i < b; i++) {
            aPow *= a;
        }

        int bPow = 1;
        for (int i = 0; i < a; i++) {
            bPow *= b;
        }

        return aPow + bPow;
    }

    public static void check() {

        int[] container1 = {4, 3};
        int[] container2 = {2, 2};
        int[] container3 = {7, 2};
        int[] container4 = {5, 5};
        int[] container5 = {13, 1};

        ArrayList<int[]> tests = new ArrayList<>();
        tests.add(container1);
        tests.add(container2);
        tests.add(container3);
        tests.add(container4);
        tests.add(container5);

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {

            int[] test = tests.get(i);
            int solution = checkPowerSum(test[0], test[1]);
            int attempt = Main.powerSum(test[0], test[1]);

            if (solution == attempt) {
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
