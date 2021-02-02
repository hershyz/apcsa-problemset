import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    /*
    SOLUTION:
    public static List<Integer> generateNums(int m, int n) {

        List<Integer> nums = new ArrayList<>();

        if (n % 2 == 1) {
            int count = (n - 1) / 2;
            int num = m;
            nums.add(num);
            num++;
            for (int i = 0; i < count; i++) {
                nums.add(num);
                num++;
            }
            num = m - 1;
            for (int i = 0; i < count; i++) {
                nums.add(num);
                num--;
            }
        }

        if (n % 2 == 0) {
            int count = n / 2;
            int num = m + 1;
            for (int i = 0; i < count; i++) {
                nums.add(num);
                num++;
            }
            num = m - 1;
            for (int i = 0; i < count; i++) {
                nums.add(num);
                num--;
            }
        }

        return nums;
    }
     */

    public static boolean verify(List<Integer> arr, int m, int n) {

        List<Integer> seen = new ArrayList<>();
        int sum = 0;

        if (arr.size() != n) {
            return false;
        }

        for (int x : arr) {
            if (seen.contains(x)) {
                return false;
            }
            seen.add(x);
            sum += x;
        }

        int mean = sum / n;
        return mean == m;
    }

    public static void check() {

        List<int[]> tests = new ArrayList<>();
        int[] c1 = new int[]{6, 3};
        int[] c2 = new int[]{6, 4};
        int[] c3 = new int[]{6, 6};
        int[] c4 = new int[]{11, 11};
        int[] c5 = new int[]{100, 1005};
        tests.add(c1);
        tests.add(c2);
        tests.add(c3);
        tests.add(c4);
        tests.add(c5);

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            int m = tests.get(i)[0];
            int n = tests.get(i)[1];
            List<Integer> result = Main.generateNums(m, n);
            if (verify(result, m, n)) {
                System.out.println("Tests: " + Arrays.toString(tests.get(i)) + " - passed");
                passed++;
            }
            else {
                System.out.println("Tests: " + Arrays.toString(tests.get(i)) + " - failed");
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
