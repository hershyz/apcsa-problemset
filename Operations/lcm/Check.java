import java.util.ArrayList;
import java.util.Arrays;

public class Check {

    private static int checkLCM(int a, int b) {

        int lcm = a;
        if (b > a) {
            lcm = b;
        }

        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    public static void check() {

        int[] container1 = {5, 2};
        int[] container2 = {10, 20};
        int[] container3 = {3, 4};
        int[] container4 = {5, 14};
        int[] container5 = {3, 5};
        int[] container6 = {7, 3};

        ArrayList<int[]> tests = new ArrayList<>();
        tests.add(container1);
        tests.add(container2);
        tests.add(container3);
        tests.add(container4);
        tests.add(container5);
        tests.add(container6);

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {

            int[] test = tests.get(i);
            int solution = checkLCM(test[0], test[1]);
            int attempt = Main.lcm(test[0], test[1]);

            if (solution == attempt) {
                System.out.println("Tests: " + Arrays.toString(test) + " - passed");
                passed++;
            }
            else {
                System.out.println("Tests: " + Arrays.toString(test) + " - failed");
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
