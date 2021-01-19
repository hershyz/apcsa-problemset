import java.util.ArrayList;
import java.util.List;

public class Check {

    public static String checkDNAStrand(String sequence) {
        String result = "";
        for (int i = 0; i < sequence.length(); i++) {
            char c = sequence.charAt(i);
            if (c == 'A') {
                result +=  "T";
            }
            if (c == 'T') {
                result += "A";
            }
            if (c == 'C') {
                result += "G";
            }
            if (c == 'G') {
                result += "C";
            }
        }
        return result;
    }

    public static void check() {

        List<String> tests = new ArrayList<>();
        tests.add("ATCG");
        tests.add("GGAT");
        tests.add("ATTCGATCGAT");
        tests.add("TTAGAACG");
        tests.add("TTTTAAAGGAAGAGGAACGCGCGAAATATTAAATATATAA");
        tests.add("AAAAAGGCCTAAGGATAGAC");

        int passed = 0;
        for (int i = 0; i < tests.size(); i++) {
            if (Main.correspondingDNAStrand(tests.get(i)).equals(checkDNAStrand(tests.get(i)))) {
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
