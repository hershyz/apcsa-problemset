import java.util.ArrayList;
import java.util.List;

public class Check {

    public static boolean checkPalindrome(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return s.equals(result);
    }

    public static void check() {

        List<String> tests = new ArrayList<>();
        tests.add("dad");
        tests.add("alaska");
        tests.add("dog");
        tests.add("asdffdsa");
        tests.add("asdfdsa");
        tests.add("ABCBA");
        tests.add("ABCDA");

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (Main.palindrome(tests.get(i)) == checkPalindrome(tests.get(i))) {
                System.out.println("Test: " + tests.get(i) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + tests.get(i) + " - failed");
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
