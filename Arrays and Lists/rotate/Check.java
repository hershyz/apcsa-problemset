import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    private static boolean compare(int[] a, int[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static int[] checkRotate(int[] arr) {

        int[] result = new int[arr.length];
        result[0] = arr[arr.length - 1];
        int index = 0;

        for (int i = 1; i < result.length; i++) {
            result[i] = arr[index];
            index++;
        }

        return result;
    }

    public static void check() {

        List<int[]> tests = new ArrayList<>();
        tests.add(new int[]{1, 1, 1, 1});
        tests.add(new int[]{10, 9, 8, 7});
        tests.add(new int[]{1, 2, 3, 1});
        tests.add(new int[]{4, 4, 4, 5, 5, 6, 1, 2, 10, 9, 13, 4});
        tests.add(new int[]{20, 21, 22, 10, 100, 105, 1023, 20, 130, 120, 2, 2, 1, 2, 2, 2, 2, 43, 39});

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (compare(Main.rotate(tests.get(i)), checkRotate(tests.get(i)))) {
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
