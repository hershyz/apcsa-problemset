import java.util.ArrayList;
import java.util.List;

public class Check {

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

    public static boolean checkMagic(int[][] arr) {

        int sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i];
        }

        for (int[] x : arr) {
            int currentRowSum = 0;
            for (int n : x) {
                currentRowSum += n;
            }
            if (currentRowSum != sum) {
                return false;
            }
        }

        for (int i = 0; i < arr[0].length; i++) {
            int currentColSum = 0;
            for (int j = 0; j < arr.length; j++) {
                currentColSum += arr[i][j];
            }
            if (currentColSum != sum) {
                return false;
            }
        }

        int rowSum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            rowSum1 += arr[i][i];
        }

        int rowSum2 = 0;
        int row = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            rowSum2 += arr[row][i];
        }

        if (rowSum1 == sum && rowSum2 == sum) {
            return true;
        }

        return false;
    }

    public static void check() {

        List<int[][]> tests = new ArrayList<>();
        int[][] test1 = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 2}
        };
        int[][] test2 = {
                {8, 1, 6},
                {3, 5, 7},
                {4, 9, 3}
        };
        int[][] test3 = {
                {1, 1},
                {1, 1}
        };
        int[][] test4 = {
                {2, 4, 2, 4},
                {4, 2, 4, 2},
                {2, 4, 2, 4},
                {4, 2, 4, 2}
        };
        tests.add(test1);
        tests.add(test2);
        tests.add(test3);
        tests.add(test4);

        int passed = 0;
        for (int[][] test : tests) {
            if (Main.isMagic(test) == checkMagic(test)) {
                System.out.println("Test:");
                display2d(test);
                System.out.println("passed");
                System.out.println("");
                passed++;
            }
            else {
                System.out.println("Test:");
                display2d(test);
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
