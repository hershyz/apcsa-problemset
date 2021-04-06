import java.util.ArrayList;
import java.util.List;

public class Check {

    public static int checkFib(int n) {

        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[arr.length - 1];
    }

    public static void check() {

        List<Integer> tests = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 9, 10, 5, 21, 22, 13};
        for (int x : arr) {
            tests.add(x);
        }

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            int test = tests.get(i);
            int solution = checkFib(test);
            int attempt = Main.fib(test);
            if (solution == attempt) {
                System.out.println("Test: " + test + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + test + " - failed");
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
