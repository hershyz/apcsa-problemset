import java.util.ArrayList;
import java.util.List;

public class Check {

    public static boolean compare(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        int[] frequencies = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            String word = a[i];
            int counter = 0;
            for (int j = 0; j < b.length; j++) {
                if (b[j].equals(word)) {
                    counter++;
                }
            }
            frequencies[i] = counter;
        }

        for (int x : frequencies) {
            if (x != 1) {
                return false;
            }
        }

        return true;
    }

    public static String[] checkUniqueWords(String s) {

        String[] split = s.split(" ");
        int uniqueCount = 1;

        for (int i = 1; i < split.length; i++) {
            String word = split[i];
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (split[j].equals(word)) {
                    found = true;
                }
            }
            if (!found) {
                uniqueCount++;
            }
        }

        String[] result = new String[uniqueCount];
        result[0] = split[0];
        int lastIndex = 1;

        for (int i = 1; i < split.length; i++) {
            String word = split[i];
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (split[j].equals(word)) {
                    found = true;
                }
            }
            if (!found) {
                result[lastIndex] = word;
                lastIndex++;
            }
        }

        return result;
    }

    public static void check() {

        List<String> tests = new ArrayList<>();
        tests.add("she sells sea shells by the sea shore");
        tests.add("read red");
        tests.add("abc acb abc acbd");
        tests.add("cat dog dog cat dog cat cat zebra");
        tests.add("zebra ZEBRA");
        tests.add("red green blue red yellow blue");

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (compare(Main.uniqueWords(tests.get(i)), checkUniqueWords(tests.get(i)))) {
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
