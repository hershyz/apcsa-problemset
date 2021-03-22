import java.util.ArrayList;

public class Check {

    private static String[] checkSplit(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }

        String[] solution = new String[count + 1];
        int lastChar = 0;
        int currentIndexPos = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                String current = "";
                for (int j = lastChar; j < i; j++) {
                    current += s.charAt(j);
                }
                lastChar = i + 1;
                solution[currentIndexPos] = current;
                currentIndexPos++;
            }
        }

        String finalIndex = "";
        for (int i = lastChar; i < s.length(); i++) {
            finalIndex += s.charAt(i);
        }
        solution[solution.length - 1] = finalIndex;

        return solution;
    }

    public static boolean compare(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void check() {

        ArrayList<String> tests = new ArrayList<>();
        tests.add("Hello, how are you");
        tests.add("Hi hi Hi hI");
        tests.add("abc def gh");
        tests.add("zebra elephant");
        tests.add("dog");

        int passed = 0;
        for (String test : tests) {

            String[] solution = checkSplit(test);
            String[] attempt = Main.splitBySpaces(test);

            if (compare(solution, attempt)) {
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
