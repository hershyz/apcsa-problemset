import java.util.ArrayList;
import java.util.List;

public class Check {

    public static int checkUniqueChars(String s) {

        int counter = 0;
        List<String> unique = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (!unique.contains(String.valueOf(s.charAt(i)))) {
                unique.add(String.valueOf(s.charAt(i)));
                counter++;
            }
        }

        return counter;
    }

    public static void check() {

        List<String> tests = new ArrayList<>();
        tests.add("aaa");
        tests.add("abc");
        tests.add("dog");
        tests.add("dogg");
        tests.add("alaska");
        tests.add("Alaska");
        tests.add("dad");
        tests.add("Dad");
        tests.add("aAaaBBbbbAbbbb");
        tests.add("     a      cc   ");

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (Main.uniqueChars(tests.get(i)) == checkUniqueChars(tests.get(i))) {
                System.out.println("Test: " + tests.get(i) + " - passed");
                passed++;
            }
            else {
                System.out.println("Test: " + tests.get(i) + " failed");
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
