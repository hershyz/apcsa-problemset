import java.util.ArrayList;
import java.util.List;

public class Check {

    public static boolean compare2d(int[][] a, int[][] b) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display2d(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                if (j != arr[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }

    public static int[][] checkRotate2d(int[][] arr) {

        int[][] result = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[j][i];
            }
        }

        return result;
    }

    public static void check() {

        int[][] test1 = new int[][] {
                {1, 1},
                {1, 1}
        };

        int[][] test2 = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] test3 = new int[][] {
                {12, 11, 44, 24, 10},
                {102, 1, 2, 2, 10},
                {134, 12, 198, 42, 44},
                {10, 11, 14, 5, 6},
                {19, 21, 20, 30, 31}
        };

        List<int[][]> tests = new ArrayList<>();
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (compare2d(Main.rotate2d(tests.get(i)), checkRotate2d(tests.get(i)))) {
                System.out.println("Test:");
                display2d(tests.get(i));
                System.out.println("passed");
                System.out.println("");
                passed++;
            }
            else {
                System.out.println("Test:");
                display2d(tests.get(i));
                System.out.println("failed");
                System.out.println("");
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
