import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    public static int checkHighestIndex(int[] arr) {

        int highestIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[highestIndex]) {
                highestIndex = i;
            }
        }

        return highestIndex;
    }

    public static void check() {

        List<int[]> tests = new ArrayList<>();
        tests.add(new int[]{0, 1, 2, 3, 4});
        tests.add(new int[]{1, 1, 1, 10});
        tests.add(new int[]{100, 101, 102, 160, 150, 1024, 13});
        tests.add(new int[]{0});
        tests.add(new int[]{100, 106, 1});

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {

            if (Main.highestIndex(tests.get(i)) == checkHighestIndex(tests.get(i))) {
                System.out.println("Test: " + Arrays.toString(tests.get(i)) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + Arrays.toString(tests.get(i)) + " failed");
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
