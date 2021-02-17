import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Check {

    private static int[] solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] > arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static boolean verify(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void check() {
        List<int[]> tests = new ArrayList<>();
        tests.add(new int[]{5, 4, 2, 3, 1, 4, 4});
        tests.add(new int[]{1, 2, 3, 4, 5});
        tests.add(new int[]{5, 4, 3, 2, 1});
        tests.add(new int[]{10, 8, 9, 6, 7, 5, 6, 4, 5, 3, 4, 1, 2});
        tests.add(new int[]{1, 5, 2, 3, 4, 7, 5, 6, 7, 9, 7, 8, 9, 20, 10});

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            int[] x = new int[tests.get(i).length];

            for (int j = 0; j < tests.get(i).length; j++) {
                x[j] = tests.get(i)[j];
            }

            int[] a = Main.descendingSort(x);
            int[] b = solution(tests.get(i));
            if (verify(b, a)) {
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
