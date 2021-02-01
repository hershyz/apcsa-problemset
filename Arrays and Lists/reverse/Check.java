import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    public static boolean compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static int[] checkReverse(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }

    public static void check() {
        List<int[]> tests = new ArrayList<>();
        tests.add(new int[]{1, 1, 1, 1});
        tests.add(new int[]{1, 2, 3, 4, 5});
        tests.add(new int[]{10, 5, 5, 7});
        tests.add(new int[]{4, 4, 5, 6, 1});
        tests.add(new int[]{10, 19, 11, 12});
        tests.add(new int[]{5, 4, 10, 2, 34, 1, 13, 21});

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (compare(Main.reverse(tests.get(i)), checkReverse(tests.get(i)))) {
                System.out.println("Test: " + Arrays.toString(tests.get(i)) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + Arrays.toString(tests.get(i)) + " - failed");
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
