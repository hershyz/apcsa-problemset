import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    public static void check() {
        List<int[]> tests = new ArrayList<>();
        int[] test1 = {2, 2};
        int[] test2 = {2, 3};
        int[] test3 = {2, 4};
        int[] test4 = {5, 2};
        int[] test5 = {6, 2};
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);
        tests.add(test5);

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            int[] test = tests.get(i);
            int solution = (int)Math.pow(test[0], test[1]);
            int attempt = Main.pow(test[0], test[1]);
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
